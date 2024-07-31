package model;

import util.TipoMedicamento;

public class Medicamento implements Comparable<Medicamento> {
    private int id;
    private String nome;
    private String lote;
    private int quantidadeCaixa;
    private TipoMedicamento tipo;
    
    public Medicamento(int id, String nome, String lote, int quantidadeCaixa, TipoMedicamento tipo) {
        this.id = id;
        this.nome = nome;
        this.lote = lote;
        this.quantidadeCaixa = quantidadeCaixa;
        this.tipo = tipo;
    }

    public Medicamento(String nome, String lote, int quantidadeCaixa, TipoMedicamento tipo) {
        this.nome = nome;
        this.lote = lote;
        this.quantidadeCaixa = quantidadeCaixa;
        this.tipo = tipo;
    }
    
    public Medicamento(String nome, String lote) {
        this.nome = nome;
        this.lote = lote;
    }
    
    public Medicamento(){
        
    }

    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    //FORMATAÇÃO DO NOME//
    public void setNome(String nome) {
        String letra = "" + nome.charAt(0);
        letra = letra.toUpperCase();
        String resto = "";
        
        for(int i = 1; i < nome.length(); i++){
            resto += nome.charAt(i);
            if(nome.charAt(i) == ' '){
                String maiuscula=""+nome.charAt(i+1);
                maiuscula=maiuscula.toUpperCase();
                resto=resto+maiuscula;
                i=i+1;                                
            } 
        }
        
        this.nome = letra + resto;
    }

    public int getQuantidadeCaixa() {
        return quantidadeCaixa;
    }

    public void setQuantidadeCaixa(int quantidadeCaixa) {
        this.quantidadeCaixa = quantidadeCaixa;
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
    
    //ORDENAÇÃO PELO NOME//
    @Override
    public int compareTo(Medicamento o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
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
        final Medicamento other = (Medicamento) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nome=" + nome + ", lote=" + lote + ", quantidadeCaixa=" + quantidadeCaixa + ", tipo=" + tipo + '}';
    }

}
