package Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import model.Medicamento;

public class Lista {
    //Declarando atributo
    private ArrayList<Medicamento> requisicao = new ArrayList();

    //método para adicionar medicamentos na lista
    public void adicionar(Medicamento medicamento) {
        this.requisicao.add(medicamento);
    }

    //método para listar os medicamentos
    //É chamado o método private ordenarPorNome para a listagem ser por ordem alfabétca
    public void listar() {
        this.ordenarPorNome();
        for (Medicamento medicamento : requisicao) {
            System.out.println(medicamento);
        }
    }

    //O método ordenarPorNome ordena a lista em ordem alfabética
    //Ele funciona utilizando o compareTo da classe medicamento
    private void ordenarPorNome() {
        Collections.sort(this.requisicao);
    }
    
    //método para retornar a lista
    public ArrayList<Medicamento> getRequisicao() {
        ordenarPorNome();
        return requisicao;
    }

}
