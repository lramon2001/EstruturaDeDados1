package vetores;

import models.Pessoa;

import java.sql.Array;
import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public String toString() {
        String informacao ="";
        for(int i=0;i< this.tamanho();i++){
           informacao+= elementos[i].toString();
        }
        return informacao;
    }

    public void remover(int pos){
        if(pos>=tamanho()){
            throw new IllegalArgumentException(String.format("A posição [%d] é invalida",pos));
        }
        Object[] ArrayIncio = Arrays.copyOfRange(this.elementos,0,pos);
        Object[] ArrayFinal = Arrays.copyOfRange(this.elementos,pos+1,this.tamanho());
        this.elementos=new Object[tamanho()-1];
        this.posicao--;
        System.arraycopy(ArrayIncio,0,this.elementos,0,ArrayIncio.length);
        System.arraycopy(ArrayFinal,0,this.elementos,ArrayIncio.length,ArrayFinal.length);

    }

    public void remover(T elemento) throws IllegalAccessException, IllegalArgumentException {
        if(indice(elemento)>=tamanho()|| indice(elemento)==-1){
            throw new IllegalArgumentException(String.format("O índice [%d] é inválido",indice(elemento)));
        }
        else{
            remover(indice(elemento));
        }
    }

    public void inserirEm(int posicao, T elemento) throws IllegalAccessException {
        if(posicao>=this.elementos.length){
            throw new IllegalAccessException(String.format("A posição é inválida [%d]",posicao));
        }
        else if(this.elementos[posicao]!=null){
            Object[] arrayFinal = Arrays.copyOfRange(this.elementos,posicao,this.elementos.length);
            Object[] arrayInicio = new Object[posicao+1];
            System.arraycopy(this.elementos,0,arrayInicio,0,posicao);
            arrayInicio[arrayInicio.length-1]=elemento;
            int novoTamanho = arrayInicio.length+arrayFinal.length;
            this.elementos=new Object[novoTamanho];
            System.arraycopy(arrayInicio,0,this.elementos,0,arrayInicio.length);
            System.arraycopy(arrayFinal,0,this.elementos,arrayInicio.length,arrayFinal.length);
            this.posicao++;
        }
        else{
            this.elementos[posicao]=elemento;
            this.posicao++;
        }

    }

    public void inserir(T elemento){
        if(this.posicao>=this.elementos.length){
            this.elementos= Arrays.copyOf(this.elementos,this.elementos.length+1);
        }
        this.elementos[this.posicao]=elemento;
        this.posicao++;
    }

    public T recuperar(int pos) throws IllegalAccessException {
        if(pos>=tamanho()){
            throw new IllegalAccessException(String.format("Posição inválida [%d]",pos));
        }
        return (T)this.elementos[pos];
    }
    public boolean contem (T entidade) throws IllegalAccessException {

        for(int i=0;i<tamanho();i++){
            if(recuperar(i)!=null &&recuperar(i).equals(entidade)){
                return true;
            }
        }
       return false;

    }
    public int indice(T elemento) throws IllegalAccessException {
        for(int i=0;i<tamanho();i++){
            if(recuperar(i)!=null && recuperar(i).equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public int tamanho(){

        return this.elementos.length;
    }


}
