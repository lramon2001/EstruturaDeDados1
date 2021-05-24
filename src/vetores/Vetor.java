package vetores;

import models.Pessoa;

import java.sql.Array;
import java.util.Arrays;

public class Vetor<T> {
    private Object[] elementos;
    private int posicao;

    public Vetor(int tamanho) {
        this.elementos = new Object[tamanho];
    }

    public Vetor(){
        this.elementos=new Object[3];
        this.posicao=0;
    }

    public void inserirEm(int pos, T elemento){
        this.elementos[pos]=elemento;
    }
    public void inserir(T elemento){
        if(this.posicao>=this.elementos.length){
            this.elementos= Arrays.copyOf(this.elementos,this.elementos.length+1);
        }
        this.elementos[this.posicao]=elemento;
        this.posicao++;
    }

    public T recuperar(int pos){
        return (T)this.elementos[pos];
    }
}
