package util;

public enum TipoMedicamento {
    TERMOLABIL("Termolábil"),
    NAO_TERMOLABIL("Não Termolábil");

    private final String descricao;

    TipoMedicamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
