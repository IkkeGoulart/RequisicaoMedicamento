
package util;

public enum Status {
    EDICAO("Em edição"),
    ANALISE("Em análise"), 
    TRANSITO("Em trânsito"), 
    ENTREGUE("Entregue");
    
    private final String situacao;
    
    Status(String situacao){
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }
    
}
