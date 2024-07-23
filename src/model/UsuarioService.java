package model;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.SQLException;
import util.TipoUsuario;

public class UsuarioService {
    private UsuarioDAO usuDAO;

    public UsuarioService() {
        this.usuDAO = new UsuarioDAO();
    }
    
    public void validar(Usuario usu){
        if(usu.getId() <= 0){
            throw new IllegalArgumentException("Id deve ser maior que 0");
        }
        
        if(usu.getLogin() == null || usu.getLogin().isBlank()){
            throw new IllegalArgumentException("Login é obrigatório ser informado");
        }
        
        if(usu.getSenha() == null || usu.getSenha().isBlank()){
            throw new IllegalArgumentException("Senha é obrigatória ser informada");
        }
        
        if(usu.getTipo() != TipoUsuario.ADMIN && usu.getTipo() != TipoUsuario.PREFEITURA){
            throw new IllegalArgumentException("Tipo inválido");
        }
    }
    
    public UsuarioDTO autenticar(String login, String senha) throws SQLException{
        System.out.println("Service autenticar");
        return usuDAO.autentificarUsuario(login, senha);
    }
}
