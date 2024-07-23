package DAO;

import DTO.UsuarioDTO;
import model.Usuario;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import util.PropertiesManager;
import util.TipoUsuario;

public class UsuarioDAO extends ConexaoDAO {

    //declarando atributos
    private static HashMap dadosSQL;

    //O bloco static é executado quando a classe é carregada pela primeira vez no sistema
    //Ela atribui à dadosSQL o método readPropertiesFile que contêm o "link" entre as chaves e instruções SQLF
    static {
        try {
            dadosSQL = new PropertiesManager("sql.properties").readPropertiesFile();
        } catch (IOException ioe) {
            System.out.println("UsuarioDAO: " + ioe);
        }
    }

    //AUTENTIFICAÇÃO DE USUÁRIO//
    public UsuarioDTO autentificarUsuario(String login, String senha) throws SQLException{
        String sql = loadSQL("Select.Autentificacao");
        System.out.println(login+senha);
        //PreparedStatement é o objeto utilizada para executar comandos sql
        PreparedStatement pstn = conexao.prepareStatement(sql);
        pstn.setString(1, login);
        pstn.setString(2, senha);
        //ResultSet é o objeto que contem informarcoes da tabela
        ResultSet rs = pstn.executeQuery();
        
        if(!rs.next()){
            System.out.println("Passou pelo !rs.next()");
            return null;
        }
        
        System.out.println("Não passou pelo !rs.next()");
        int id = rs.getInt("id");
        String tipoUsuario = rs.getString("tipo");
        TipoUsuario tipo = TipoUsuario.valueOf(tipoUsuario);
        
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setLogin(login);
        usuario.setTipo(tipo);
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario);
        
        return usuarioDTO;
    }
    
    //ARMAZENAR INSTRUÇÕES SQL DO SQL.PROPERTIES//
    private static String loadSQL(String key) {
        String sql = null;
        sql = (String) dadosSQL.get(key);
        return sql;
    }

}
