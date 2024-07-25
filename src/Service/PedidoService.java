package Service;

import DAO.PedidoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Pedido;
import util.Status;
import static util.Status.EDICAO;

public class PedidoService {

    private PedidoDAO pedDAO;

    public PedidoService() {
        this.pedDAO = new PedidoDAO();
    }

    public void validar(Pedido ped) {
        if (ped.getIdUsuario() <= 0) {
            throw new IllegalArgumentException("idUsuario deve ser maior que 0.");
        }
        if (ped.getStatus() != Status.ANALISE && ped.getStatus() != Status.ENTREGUE && ped.getStatus() != Status.TRANSITO && ped.getStatus() != Status.EDICAO) {
            throw new IllegalArgumentException("Tipo de status inválido.");
        }
    }

    public void adicionar(int idUsuario) throws SQLException {
        Pedido ped = new Pedido(idUsuario);
        validar(ped);
        this.pedDAO.adicionar(idUsuario);
    }

    public void verificarPedidoEdicao(int idUsuario) throws SQLException {
        boolean pedidoEmEdicao = this.pedDAO.verificarPedidoEdicao(idUsuario);

        if (pedidoEmEdicao == false) {
            this.adicionar(idUsuario);
            this.verificarPedidoEdicao(idUsuario);
        }
    }

    public int getIdPedidoEdicao(int idUsuario) throws SQLException {
        int id = this.pedDAO.getIdPedidoEdicao(idUsuario);
        return id;
    }

    public ArrayList<Pedido> getPedidoPorIdUsuario(int idUsuario) throws SQLException {
        ArrayList<Pedido> pedList = this.pedDAO.getPedidoPorIdUsuario(idUsuario);
        ArrayList<Pedido> pedListSemEdicao = new ArrayList<>();

        for (Pedido ped : pedList) {
            if (ped.getStatus() != EDICAO) {
                pedListSemEdicao.add(ped);
            }
        }

        return pedListSemEdicao;
    }

    public void enviar(int id) throws SQLException {
        this.pedDAO.enviar(id);
    }

    public void alterarStatus(int id, Status novoStatus) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("id deve ser maior que 0.");
        }

        if (novoStatus != Status.ANALISE && novoStatus != Status.ENTREGUE && novoStatus != Status.TRANSITO) {
            throw new IllegalArgumentException("Tipo de status inválido.");
        }
        this.pedDAO.alterarStatus(id, novoStatus);
    }

}
