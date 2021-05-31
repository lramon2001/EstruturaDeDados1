package pilhas;

import listasLigadas.ListaDuplamenteLigada;

public class Pilha<T> {
    private ListaDuplamenteLigada<T> lista;

    public Pilha() {
        this.lista=new ListaDuplamenteLigada<T>();
    }

}
