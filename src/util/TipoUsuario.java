package util;

public enum TipoUsuario {
    ADMIN("Assistência Farmacêutica"),
    PREFEITURA("Prefeitura");

    private String tipo;

    TipoUsuario(String tipo) {
        this.tipo = tipo;
    }

}
