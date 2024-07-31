package util;

public enum TipoUsuario {
    ADMIN("Assistência Farmacêutica"),
    PREFEITURA("Prefeitura");

    private final String tipo;

    TipoUsuario(String tipo) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

}
