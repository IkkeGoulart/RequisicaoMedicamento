package DAO;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import util.PropertiesManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.PedidoMedicamento;

public class PedidoMedicamentoDAO extends ConexaoDAO {

    private static HashMap dadosSQL;

    static {
        try {
            dadosSQL = new PropertiesManager("sql.properties").readPropertiesFile();
        } catch (IOException ioe) {
            System.out.println("MedicamentoDAO: " + ioe);
        }
    }

    public void adicionar(int idPedido, int idMedicamento, int quantidade) throws SQLException {
        String sql = loadSQL("Insert.PedidoMedicamento");
        PreparedStatement pstn = conexao.prepareStatement(sql);
        pstn.setInt(1, idPedido);
        pstn.setInt(2, idMedicamento);
        pstn.setInt(3, quantidade);
        pstn.executeUpdate();
    }

    public void excluir(int idMedicamento, int idPedido) throws SQLException {
        String sql = loadSQL("Delete.PedidoMedicamento");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, idMedicamento);
        pstm.setInt(2, idPedido);
        pstm.executeUpdate();
    }
    
    public void editarQuantidade(int idMedicamento, int idPedido, int novaQuantidade) throws SQLException{
        String sql = loadSQL("Update.PedidoMedicamentoQuantidade");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, novaQuantidade);
        pstm.setInt(2, idMedicamento);
        pstm.setInt(3, idPedido);
        pstm.executeUpdate();
        
    }
    
    public void mostrarTudo() throws SQLException{
        PreparedStatement pstm = conexao.prepareStatement("SELECT * FROM APP.PEDIDO_MEDICAMENTO");
        ResultSet rs = pstm.executeQuery();
        
        while(rs.next()){
            int idPedido = rs.getInt("idPedido");
            int idMedicamento = rs.getInt("idMedicamento");
            int quantidade = rs.getInt("quantidade");
            
            PedidoMedicamento pedMed = new PedidoMedicamento(idPedido, idMedicamento, quantidade);
            System.out.println(pedMed);
        }
    }

    public boolean verificarMedicamentosIguais(int idPedido, int idMedicamento) throws SQLException {
        String sql = loadSQL("Select.PedidoMedicamentoIguais");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, idPedido);
        pstm.setInt(2, idMedicamento);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }

        return false;
    }

    public ArrayList<PedidoMedicamento> listarMedicamentos(int idPedido) throws SQLException {
        ArrayList<PedidoMedicamento> pedMedList = new ArrayList();
        String sql = loadSQL("Select.PedidoMedicamentoPorId");
        PreparedStatement pstn = conexao.prepareStatement(sql);
        pstn.setInt(1, idPedido);
        ResultSet rs = pstn.executeQuery();
        while (rs.next()) {
            int idMedicamento = rs.getInt("idMedicamento");
            int quantidade = rs.getInt("quantidade");

            PedidoMedicamento pedMed = new PedidoMedicamento(idPedido, idMedicamento, quantidade);
            pedMedList.add(pedMed);
        }
        return pedMedList;
    }

    public void excluirTudo() throws SQLException {
        PreparedStatement pstm = conexao.prepareStatement("DELETE FROM APP.PEDIDO_MEDICAMENTO");
        pstm.executeUpdate();
    }

    private static String loadSQL(String key) {
        String sql = null;
        sql = (String) dadosSQL.get(key);
        return sql;
    }
}
