package Controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.PedidoService;
import util.Status;

public class PedidoController {

    private PedidoService pedService;

    public PedidoController() {
        this.pedService = new PedidoService();
    }

    public void adicionar(int idUsuario) {
        try {
            this.pedService.adicionar(idUsuario);
        } catch (SQLException ex) {
            Logger.getLogger(PedidoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void verificarPedidoEdicao(int idUsuario) {
        try {
            this.pedService.verificarPedidoEdicao(idUsuario);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar pedidos em edição");
        }
    }

    public int getIdPedidoEdicao(int idUsuario){
        try {
             int id = this.pedService.getIdPedidoEdicao(idUsuario);
             return id;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o id do pedido");
            return 0;
        }
    }
    
    public void enviar(int id){
        try{
            int botaoJop = JOptionPane.showConfirmDialog(null, "Deseja enviar o pedido?", "WARNING", JOptionPane.YES_NO_OPTION);

            if (botaoJop == JOptionPane.YES_OPTION) {
                this.pedService.enviar(id);
                JOptionPane.showMessageDialog(null, "Pedido enviado com sucesso!");
            }
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao enviar o pedido.");
        }
    }
    
    public void alterarStatus(int id, Status novoStatus) {
        try {
            this.pedService.alterarStatus(id, novoStatus);
            JOptionPane.showMessageDialog(null, "Status do pedido alterado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar o status do pedido.");
        }
    }
}
