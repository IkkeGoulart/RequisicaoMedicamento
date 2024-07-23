
package model;

import Controller.Lista;
import util.Status;

public class Pedido {
    private int id;
    private int idUsuario;
    private Status status;

    
    public Pedido(int id, int idUsuario, Status status) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.status = status;
    }

    
    public Pedido(int idusuario) {
        this.idUsuario = idusuario;
        this.status = Status.EDICAO;
    }

    public Pedido(int id, Status status) {
        this.id = id;
        this.status = status;
    }

    public Pedido(int id, int idUsuario) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.status = Status.EDICAO;
    }
    
    public int getId() {
        return id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdusuario(int idusuario) {
        this.idUsuario = idusuario;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.id;
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
        final Pedido other = (Pedido) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", idUsuario=" + idUsuario + ", status=" + status + '}';
    }

    
    
    
    
}
