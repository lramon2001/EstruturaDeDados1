package vetores;

import models.Pessoa;

public class Vetor<T> {
    private Object[] elementos;

    public Vetor(int tamanho) {
        this.elementos = new Object[tamanho];
    }

    public void inserirEm(int pos, T elemento){
        this.elementos[pos]=elemento;
    }

    public T recuperar(int pos){
        return (T)this.elementos[pos];
    }
}
