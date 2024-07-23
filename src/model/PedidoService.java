package model;

import DAO.PedidoDAO;
import java.sql.SQLException;
import util.Status;

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

    public void verificarPedidoEdicao(int idUsuario) throws SQLException{
        boolean pedidoEmEdicao = this.pedDAO.verificarPedidoEdicao(idUsuario);
        
        if(pedidoEmEdicao == false){
            this.adicionar(idUsuario);
            this.verificarPedidoEdicao(idUsuario);
        }
    }
    
    public int getIdPedidoEdicao(int idUsuario) throws SQLException{
        int id = this.pedDAO.getIdPedidoEdicao(idUsuario);
        return id;
    }
    
    public void enviar(int id) throws SQLException{
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
