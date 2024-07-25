package Controller;

import DTO.PedidoDTO;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Service.PedidoMedicamentoService;

public class PedidoMedicamentoController {

    private final PedidoMedicamentoService pedMedService;

    public PedidoMedicamentoController() {
        this.pedMedService = new PedidoMedicamentoService();
    }

    public void adicionar(int idPedido, int idMedicamento, int quantidade) {
        try {
            this.pedMedService.adicionar(idPedido, idMedicamento, quantidade);
            JOptionPane.showMessageDialog(null, "Medicamento adicionado ao pedido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar medicamento ao pedido");
        }
    }

    public void excluir(int idMedicamento, int idPedido) {
        try {
            int botaoJop = JOptionPane.showConfirmDialog(null, "Tem certeza que quer excluir este medicamento?", "WARNING", JOptionPane.YES_NO_OPTION);

            if (botaoJop == JOptionPane.YES_OPTION) {
                this.pedMedService.excluir(idMedicamento, idPedido);
                JOptionPane.showMessageDialog(null, "Medicamento excluído do pedido!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir medicamento.");
        }
    }

    public void editarQuantidade(int idMedicamento, int idPedido) {
        try {
            String novaQuantidadeString = JOptionPane.showInputDialog(null, "Digite a nova quantidade");
            int novaQuantidade = Integer.parseInt(novaQuantidadeString);

            if (novaQuantidade == 0) {
                excluir(idMedicamento, idPedido);
            } else {
                this.pedMedService.editarQuantidade(idPedido, idMedicamento, novaQuantidade);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar a quantidade pedida");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
}
