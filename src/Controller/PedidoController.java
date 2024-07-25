package Controller;

import DTO.UsuarioDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Pedido;
import Service.PedidoService;
import util.Status;
import view.HistoricoRequisicao;
import view.PedidoModelo;

public class PedidoController {

    private final PedidoService pedService;

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

    public int getIdPedidoEdicao(int idUsuario) {
        try {
            int id = this.pedService.getIdPedidoEdicao(idUsuario);
            return id;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o id do pedido");
            return 0;
        }
    }

    public ArrayList<PedidoModelo> carregarPedidos(UsuarioDTO usuario, HistoricoRequisicao histReq) {
        try {
            ArrayList<Pedido> pedList = this.pedService.getPedidoPorIdUsuario(usuario.getId());
            ArrayList<PedidoModelo> pedModList = new ArrayList<>();

            for (Pedido ped : pedList) {
                PedidoModelo pedMod = new PedidoModelo(ped, histReq, usuario);
                pedModList.add(pedMod);
            }

            return pedModList;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar histórico de pedidos");
            return null;
        }
    }

    public void enviar(int id) {
        try {
            int botaoJop = JOptionPane.showConfirmDialog(null, "Deseja enviar o pedido?", "WARNING", JOptionPane.YES_NO_OPTION);

            if (botaoJop == JOptionPane.YES_OPTION) {
                this.pedService.enviar(id);
                JOptionPane.showMessageDialog(null, "Pedido enviado com sucesso!");
            }

        } catch (SQLException ex) {
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
