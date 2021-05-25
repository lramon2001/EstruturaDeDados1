package main;

import models.Pessoa;
import vetores.Vetor;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
       menu();
    }
    private static void menu() throws IllegalAccessException {
        int x;
        do{
            String menu =
                    "1-Fazer gerenciamento de memória;\n" +
                    "2-Estudo de vetores\n"+
                    "3-Usar o vetor que cria novas posições\n"+
                    "0-Sair";

            String strx = JOptionPane.showInputDialog(null,menu);
            x=Integer.parseInt(strx);
            switch(x){
                case 1:
                    gerenciamentoDeMemoria();
                    break;
                case 2:
                    int tamanho = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho do vetor de pessoas que desejas criar."));
                    vetores(tamanho);
                    break;
                case 3:
                    vetoresQueCrescem();
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Obrigado por testar meu software! " +
                            "\n\n     MIT License © Lucas Ramon ");
            }
        }
        while(x!=0);
    }
    private static void gerenciamentoDeMemoria(){
           JOptionPane.showMessageDialog(null,"Fazendo o gerenciamento usando variáveis int");
           int a =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
           JOptionPane.showMessageDialog(null,"Valor de a: "+a);
           int b=a;
           JOptionPane.showMessageDialog(null,"Agora o software criou a variável b e a ela foi atribuida o valor de a");
           JOptionPane.showMessageDialog(null,"O valor de a é: "+a+"\nO valor de b é: "+b);
           b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um novo valor para b"));
           JOptionPane.showMessageDialog(null,"O valor de a é: "+a+"\nO valor de b é: "+b);
           JOptionPane.showMessageDialog(null,"A é igual a B? \n"+"R: "+(a==b));
           JOptionPane.showMessageDialog(null,"Até aqui tudo bem, nada fora do que já haviamos previsto.");
           JOptionPane.showMessageDialog(null,"Fazendo o gerenciamento usando variáveis do Tipo Pessoa");
           String nome=JOptionPane.showInputDialog(null,"Digite o nome para a pessoa 1");
           int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um id para a pessoa 1"));
           Pessoa p1 = new Pessoa(id,nome);
           JOptionPane.showMessageDialog(null,"Pessoa 1:\n"+p1.toString());
           Pessoa p2 = p1;
           JOptionPane.showMessageDialog(null,"Agora o software criou um objeto pessoa 2 idêntico ao pessoa 1.");
           JOptionPane.showMessageDialog(null,"Pessoa 1:\n"+p1.toString()+"\nPessoa 2:\n"+p2.toString());
           JOptionPane.showMessageDialog(null,"Agora vamos mudar o nome da pessoa 2 para fazermos um teste.");
           String nome2 = JOptionPane.showInputDialog(null,"Digite um novo nome para pessoa 2");
           p2.setNome(nome2);
           JOptionPane.showMessageDialog(null,"Pessoa 1:\n"+p1.toString()+"\nPessoa 2:\n"+p2.toString());
           JOptionPane.showMessageDialog(null,"p1 é igual p2?\n"+"R: "+(p1==p2));
           JOptionPane.showMessageDialog(null,"Doideiraaaa! O nome dos dois objetos mudaram!!!\nFreud Explica isso???");
           JOptionPane.showMessageDialog(null,
                   "A explicação é simples. Ao fazer Pessoa p2=p1, na verdade estamos copiando a referência para acessar o objeto.\n" +
                           " Ou seja,estamos copiando o ponteiro que nos leva ao conteúdo do objeto p1. E como o ponteiro é o mesmo ele nos\n" +
                           " leva ao mesmo objeto (p1).");
           JOptionPane.showMessageDialog(null,
                   "Vale explicitar o motivo do mesmo não ocorrer com os tipos inteiros" +
                           "\nA explicação também é simples!. Há duas regiões de memória em que a" +
                           "\nJVM pode alocar os dados: a stack e a heap. Ambas são capazes de ar-" +
                           "\nmazenar dados, a diferença é justamente o tipo de dado que elas guar-" +
                           "\ndam. A stack é uma região de memória muito pequena, porém muito organi-" +
                           "\nzada e é usada para guardar os valueTypes, ou seja, os tipos primitivos." +
                           "\nA região heap é muito maior e muito mais desergonizada e é utilizada pela" +
                           "\nJVM para alocar os dados mais complexos: referenceTypes.");
           JOptionPane.showMessageDialog(null,
                   "Os ponteiros ficam alocados na stack, como os ponteiros são variáveis que " +
                           "\nguardam o endereço de memória dos referenceTypes, a JVM os utiliza para en-" +
                           "\ncontrar na caótica região heap e os encontram rapidinho. Sim, esta foi uma" +
                           "\nsacada genial da engenharia de software. Imagina se a JVM tivesse que acessar" +
                           "\ntoda a memória para encontrar um dado?? Com certeza os programas seriam muito" +
                           "\nlentos. Os tipos inteiros não sofreram a mudança ao mesmo tempo pois a JVM cria" +
                           "\nespaços separados na memória para todo tipo primitivo. ");



    }

    private static void vetores(int tamanho) throws IllegalAccessException {
        JOptionPane.showMessageDialog(null,"Neste momento o software criou um vetor de pessoas com "+tamanho+" posições");
        Vetor<Pessoa>vetorPessoas = new Vetor<Pessoa>(tamanho);
        StringBuilder list = new StringBuilder();
        int pos=0;
        for(int i=0;i<vetorPessoas.tamanho();i++){
            String nome = JOptionPane.showInputDialog(null,"Digte o nome da pessoa "+i);
            int id=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o id da pessoa "+i));
            Pessoa p = new Pessoa(id,nome);
            vetorPessoas.inserirEm(i,p);
            pos++;
        }
        for(int i=0;i<tamanho;i++){
            list.append("Pessoa "+i+" ->"+" Nome: "+ vetorPessoas.recuperar(i).getNome()+" id: "+ vetorPessoas.recuperar(i).getId()+"\n");
        }
        JOptionPane.showMessageDialog(null,list.toString());
        JOptionPane.showMessageDialog(null,"O nosso vetor é genérico, desta forma vamos adcionar inteiros ao vetor.");
        tamanho=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tamanho do vetor de inteiros "));
        Vetor<Integer> vetorDeInteiros = new Vetor<Integer>(tamanho);
        StringBuilder listInteger = new StringBuilder();
        listInteger.append("Vetor de inteiros que você escolheu: \n");
        for(int i=0;i<tamanho;i++){
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número a ser adicionado"));
            vetorDeInteiros.inserirEm(i,numero);
            listInteger.append(vetorDeInteiros.recuperar(i)+"\n");
        }

        JOptionPane.showMessageDialog(null,listInteger.toString());
        JOptionPane.showMessageDialog(null,"Agora vamos testar se o método contém está funcionando");
        Pessoa pa =new Pessoa(1,"Slash");
        vetorPessoas.inserir(pa);
        Pessoa pb = new Pessoa(4,"Axl");
        JOptionPane.showMessageDialog(null,"Se a resposta for true, então tá tudo certo!\n"+vetorPessoas.contem(pa));
        JOptionPane.showMessageDialog(null,"Se a resposta agora for false bom também!\n"+vetorPessoas.contem(pb));
        Pessoa pc = new Pessoa(60,"Duff");
        vetorPessoas.inserirEm(0,pc);
        Pessoa pd = new Pessoa(738,"Michael Jackson");
        JOptionPane.showMessageDialog(null,"Agora vamos testar se o método indice está funcionando");
        JOptionPane.showMessageDialog(null,"Se a resposta for zero, estamos no caminho correto.\n"+vetorPessoas.indice(pc));
        JOptionPane.showMessageDialog(null,"Se a resposta for -1, é mais uma felicidade para nós =-)\n"+vetorPessoas.indice(pd));

    }
    public static void vetoresQueCrescem() throws IllegalAccessException {
        Vetor<Pessoa> pessoas = new Vetor<Pessoa>();
        StringBuilder listaPessoas = new StringBuilder();
        int loop =1;
        listaPessoas.append("Lista das pessoas\n");

        while(loop!=0){
            loop=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para sair do loop\n E qualquer numero inteiro para continuar."));
            if(loop==0){
                Pessoa p5 = new Pessoa(67,"Péle");
                pessoas.inserirEm(1,p5);
                break;
            }
            Pessoa p2 = new Pessoa();
            String nome=JOptionPane.showInputDialog(null,"Digite o nome da pessoa que desejas adicionar ao vetor de pessoas");
            int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o id da pessoa que desejas adicionar ao vetor de pessoas"));
            p2.setNome(nome);
            p2.setId(id);
            pessoas.inserir(p2);
        }

        JOptionPane.showMessageDialog(null,pessoas.toString());
    }
}
