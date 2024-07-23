
package DTO;

import util.TipoMedicamento;

public class PedidoDTO implements Comparable<PedidoDTO>{
    private int idPedido;
    private int idMedicamento;
    private String nomeMedicamento;
    private String lote;
    private TipoMedicamento tipo;
    private int quantidade;
    
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

    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public TipoMedicamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMedicamento tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final PedidoDTO other = (PedidoDTO) obj;
        if (this.idPedido != other.idPedido) {
            return false;
        }
        return this.idMedicamento == other.idMedicamento;
    }

    @Override
    public String toString() {
        return "PedidoDTO{" + "idPedido=" + idPedido + ", idMedicamento=" + idMedicamento + ", nomeMedicamento=" + nomeMedicamento + ", lote=" + lote + ", tipo=" + tipo + ", quantidade=" + quantidade + '}';
    }

    @Override
    public int compareTo(PedidoDTO o) {
        return this.nomeMedicamento.compareTo(o.getNomeMedicamento());
    }
    
    
    
}
