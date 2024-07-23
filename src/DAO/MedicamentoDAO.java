/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.Medicamento;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.PropertiesManager;
import util.TipoMedicamento;
import static util.TipoMedicamento.NAO_TERMOLABIL;
import static util.TipoMedicamento.TERMOLABIL;

public class MedicamentoDAO extends ConexaoDAO{
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
    
    public void adicionar(Medicamento med) throws SQLException{
        String sql = loadSQL("Insert.Medicamento");
        PreparedStatement pstn = conexao.prepareStatement(sql);
        pstn.setString(1, med.getNome());
        pstn.setInt(2, med.getQuantidadeCaixa());
        pstn.setString(3, med.getLote());
        pstn.setString(4, med.getTipo().getDescricao());
        pstn.executeUpdate();
    }
    
    public void excluir(String lote) throws SQLException{
        String sql = loadSQL("Delete.Medicamento");
        PreparedStatement pstn = conexao.prepareStatement(sql);
        pstn.setString(1, lote);
        pstn.executeUpdate();
    }
    
    public int buscarIdPorNomeELote(String nome, String lote) throws SQLException{
        int id = 0;
        String sql = loadSQL("Select.MedicamentoPorNomeELote");
        PreparedStatement pstn = conexao.prepareStatement(sql);
        pstn.setString(1, nome);
        pstn.setString(2, lote);
        
        ResultSet rs = pstn.executeQuery();
        
        while(rs.next()){
            id = rs.getInt("id");
        }
        return id;
    }
    
    public Medicamento buscarPorId(int idMedicamento) throws SQLException{
        String sql = loadSQL("Select.MedicamentoPorId");
        PreparedStatement pstm = conexao.prepareStatement(sql);
        pstm.setInt(1, idMedicamento);
        ResultSet rs = pstm.executeQuery();
        
        Medicamento med = null;
        
        while(rs.next()){
            String nome = rs.getString("nome");
            String lote = rs.getString("lote");
            String tipoString = rs.getString("tipo");
            TipoMedicamento tipo = null;
            
            if(tipoString.equals("Termolábil")){
                tipo = TERMOLABIL;
            }
            else if(tipoString.equals("Não Termolábil")){
                tipo = NAO_TERMOLABIL;
            }
            
            med = new Medicamento(idMedicamento, nome, lote, idMedicamento, tipo);
        }
        return med;
    }
    
    //MÉTODO P/ TESTE
    public void listarTudo() throws SQLException{
        Medicamento med = null;
        String sql = loadSQL("Select.MedicamentoTudo");
        PreparedStatement pstn = conexao.prepareStatement(sql);
        ResultSet rs = pstn.executeQuery();
        while(rs.next()){
            String nome = rs.getString("nome");
            String lote = rs.getString("lote");
            int id = rs.getInt("id");
            int quantidadeCaixa = rs.getInt("quantidadeCaixa");
            TipoMedicamento termolabil = TipoMedicamento.TERMOLABIL;
            String termolabilString = rs.getString("tipo");
            if ("Não Termolábil".equals(termolabilString)) {
                termolabil = TipoMedicamento.NAO_TERMOLABIL;
            } else if ("Termolábil".equals(termolabilString)) {
            termolabil = TipoMedicamento.TERMOLABIL;
            }
            med = new Medicamento(id, nome, lote, quantidadeCaixa, termolabil);
            System.out.println(med);
        }
    }
    
    //O método loadSQL é utilizado para armazenar as instruções SQL do arquivo sql.properties
    private static String loadSQL(String key) {
        String sql = null;
        sql = (String) dadosSQL.get(key);
        return sql;
    }
    
}
