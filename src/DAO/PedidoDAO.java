package DAO;

import java.io.IOException;
import java.util.HashMap;
import model.Pedido;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.PropertiesManager;
import java.sql.ResultSet;
import util.Status;
import static util.Status.ANALISE;
import static util.Status.EDICAO;

public class PedidoDAO extends ConexaoDAO {

    //declarando atributos
    private static HashMap dadosSQL;

    //O bloco static é executado quando a classe é carregada pela primeira vez no sistema
    //Ela atribui à dadosSQL o método readPropertiesFile que contêm o "link" entre as chaves e instruções SQLF
    static {
        try {
            dadosSQL = new PropertiesManager("sql.properties").readPropertiesFile();
        } catch (IOException ioe) {
            System.out.println("MedicamentoDAO: " + ioe);
        }
    }

    public boolean verificarPedidoEdicao(int idUsuario) throws SQLException {
        String sql = loadSQL("Select.PedidoStatus");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, idUsuario);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }

        return false;
    }
    
    public int getIdPedidoEdicao(int idUsuario) throws SQLException{
        int id = 0;
        String sql = loadSQL("Select.PedidoIdEmEdicao");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, idUsuario);
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            id = rs.getInt("id");
        }
        return id;
    }

    public void adicionar(int idUsuario) throws SQLException {
        String sql = loadSQL("Insert.Pedido");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, idUsuario);
        pstm.setString(2, Status.EDICAO.getSituacao()); // Define o status como "Em edição"
        pstm.executeUpdate();
    }

    public void enviar(int id) throws SQLException{
        String sql = loadSQL("Update.StatusPedido");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        System.out.println(Status.ANALISE.getSituacao());
        pstm.setString(1, "Em análise");
        pstm.setInt(2, id);
        pstm.executeUpdate();
    }
    
    public void alterarStatus(int id, Status novoStatus) throws SQLException {
        String sql = loadSQL("Update.StatusPedido");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, id);
        pstm.setString(2, novoStatus.getSituacao());
        pstm.executeUpdate();
    }

    //TIRAR DEPOIS
    public void mostrarTudo() throws SQLException {
        PreparedStatement pstm = conexao.prepareStatement("SELECT * FROM APP.PEDIDO");
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id");
            int idUsuario = rs.getInt("idUsuario");
            String statusString = rs.getString("status");

            Status status = null;

            if (statusString.equals("Em edição")) {
                status = EDICAO;
            }
            
            if( statusString.equals("Em análise")){
                status = ANALISE;
            }

            Pedido ped = new Pedido(id, idUsuario, status);
            System.out.println(ped);
        }
    }

    //TIRAR DEPOIS
    public void deletarTudo() throws SQLException {
        PreparedStatement pstm = conexao.prepareStatement("DELETE FROM APP.PEDIDO");
        pstm.executeUpdate();
    }

    private static String loadSQL(String key) {
        String sql = null;
        sql = (String) dadosSQL.get(key);
        return sql;
    }
}
