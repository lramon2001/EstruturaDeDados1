package pilhas;

import listasLigadas.ListaDuplamenteLigada;

public class Pilha<T> {
    private ListaDuplamenteLigada<T> lista;

    public Pilha() {
        this.lista=new ListaDuplamenteLigada<T>();
    }

    public boolean estaVazia(){
        return this.lista.estaVazia();
    }

    public void empilhar(T elemento){
        this.lista.inserir(elemento);
    }


}
