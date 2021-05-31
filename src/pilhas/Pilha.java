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
    public T desempilhar(){
        if(estaVazia()){
            return null;
        }
        T resultado = lista.recuperar(this.lista.tamanho()-1);
        this.lista.remover(this.lista.tamanho()-1);
        return resultado;
    }


}
