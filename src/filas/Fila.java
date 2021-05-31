package filas;

import listasLigadas.ListaLigada;

public class Fila<T> {
    private ListaLigada<T> listaLigada ;

    public Fila() {
        this.listaLigada= new ListaLigada<T>();
    }
    public void enfileirar(T elemento){
        listaLigada.inserir(elemento);
    }
    public T desenfileirar(){
        if(estaVazia()){
            return null;
        }
      T resultado = this.listaLigada.recuperar(0);
        this.listaLigada.remover(0);
        return resultado;
    }
    public boolean estaVazia(){
     return this.listaLigada.estaVazia();
    }
}
