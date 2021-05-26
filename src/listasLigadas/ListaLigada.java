package listasLigadas;

public class ListaLigada<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    public ListaLigada() {
        this.primeiroNo=null;
        this.ultimoNo=null;
        this.tamanho=0;
    }
    public boolean estaVazia(){
        return this.tamanho==0;
    }

    public void inserir(T elemento){
        No<T> novoNo = new No<T>(elemento);
        if(estaVazia()){
            this.primeiroNo=novoNo;
            this.ultimoNo=novoNo;
        }
        else{
            this.ultimoNo.setProximo(novoNo);
            this.ultimoNo=novoNo;
        }
        tamanho++;
    }
    public int tamanho(){
        return this.tamanho;
    }
    public void inserirEm(int posicao, T elemento){
        if(posicao==0){
            No<T> novoNo = new No<T>(elemento);
            novoNo.setProximo(this.primeiroNo);
            this.primeiroNo=novoNo;
        }
        else if(posicao==tamanho()-1){
            No<T> novoNo = new No<T>(elemento);
            this.ultimoNo.setProximo(novoNo);
            this.ultimoNo=novoNo;

        }
        else{
            No<T> novoNo = new No<T>(elemento);
            No<T> noAtual = recuperarNo(posicao);
            No<T> noAnteior = recuperarNo(posicao-1);
            noAnteior.setProximo(novoNo);
            novoNo.setProximo(noAtual);

        }
        this.tamanho++;
    }
    private No<T> recuperarNo(int pos){
        No<T> noAtual = new No<T>();
        if(pos>=tamanho()){
            throw new IllegalArgumentException(String.format("A posição [%d] não é válida",pos));
        }
        else{
            for(int i=0;i<=pos;i++){
                if(i==0){
                    noAtual=this.primeiroNo;
                }
                else{
                    noAtual=noAtual.getProximo();
                }

            }
            return noAtual;
        }
    }

    @Override
    public String toString() {
        if(estaVazia()){
            return "ListaLigada{}";
        }
        else {
            No<T> noAtual = this.primeiroNo;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Lista[ ");
            stringBuilder.append(noAtual.getElemento()!=null ? noAtual.getElemento().toString() : "<NULO>");
            stringBuilder.append(", ");
            while(noAtual.getProximo()!=null){
                stringBuilder.append(noAtual.getProximo().getElemento()!=null ? noAtual.getProximo().getElemento().toString() : "<NULO>");
                stringBuilder.append(", ");
                noAtual=noAtual.getProximo();
            }
            stringBuilder.append(" ]");
            return stringBuilder.toString();
        }

    }
}
