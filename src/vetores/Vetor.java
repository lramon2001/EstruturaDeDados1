package vetores;

import models.Pessoa;

public class Vetor {
    private Pessoa[] pessoas;

    public Vetor(int tamanho) {
        this.pessoas = new Pessoa[tamanho];
    }

    public void inserirEm(int pos, Pessoa p){
        this.pessoas[pos]=p;
    }

    public Pessoa recuperar(int pos){
        return this.pessoas[pos];
    }
}
