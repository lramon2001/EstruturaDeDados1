package main;

import models.Pessoa;
import vetores.Vetor;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
       menu();
    }
    private static void menu(){
        int x;
        do{
            String menu =
                    "1-Fazer gerenciamento de memória;\n" +
                    "2-Estudo de vetores\n"+
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

    private static void vetores(int tamanho){
        JOptionPane.showMessageDialog(null,"Neste momento o software criou um vetor com "+tamanho+" posições");
        Vetor<Pessoa>vetorPessoas = new Vetor<Pessoa>(tamanho);
        StringBuilder list = new StringBuilder();
        for(int i=0;i<tamanho;i++){
            String nome = JOptionPane.showInputDialog(null,"Digte o nome da pessoa "+i);
            int id=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o id da pessoa "+i));
            Pessoa p = new Pessoa(id,nome);
            vetorPessoas.inserirEm(i,p);
        }
        for(int i=0;i<tamanho;i++){
            list.append("Pessoa "+i+" ->"+" Nome: "+ vetorPessoas.recuperar(i).getNome()+" id: "+ vetorPessoas.recuperar(i).getId()+"\n");
        }
        JOptionPane.showMessageDialog(null,list.toString());
    }
}
