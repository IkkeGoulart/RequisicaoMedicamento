package DTO;

import model.Usuario;
import util.TipoUsuario;


public class UsuarioDTO {
    private int id;
    private String usuario;
    private TipoUsuario tipo;

    public UsuarioDTO(){
        
    }

    public UsuarioDTO(int id, String usuario, TipoUsuario tipo) {
        this.id = id;
        this.usuario = usuario;
        this.tipo = tipo;
    }
    
    public UsuarioDTO(Usuario usuario){
        this.id = usuario.getId();
        this.usuario = usuario.getLogin();
        this.tipo = usuario.getTipo();
    }
    
    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }
    
    
}
