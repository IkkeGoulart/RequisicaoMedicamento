package model;

//Relacionamento n:n entre Pedido e Medicamento
public class PedidoMedicamento {
    private int idPedido;
    private int idMedicamento;
    private int quantidade;

    public PedidoMedicamento(int idPedido, int idMedicamento, int quantidade) {
        this.idPedido = idPedido;
        this.idMedicamento = idMedicamento;
        this.quantidade = quantidade;
    }

    public PedidoMedicamento() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.idPedido;
        hash = 83 * hash + this.idMedicamento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PedidoMedicamento other = (PedidoMedicamento) obj;
        if (this.idPedido != other.idPedido) {
            return false;
        }
        return this.idMedicamento == other.idMedicamento;
    }

    @Override
    public String toString() {
        return "PedidoMedicamento{" + "idPedido=" + idPedido + ", idMedicamento=" + idMedicamento + ", quantidade=" + quantidade + '}';
    }
    
    
    
}
