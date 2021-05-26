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
                    "0-Sair";

            String strx = JOptionPane.showInputDialog(null,menu);
            x=Integer.parseInt(strx);
            switch(x){
                case 1:
                    gerenciamentoDeMemoria();
                    break;
                case 2:

                    vetores();
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

    private static void vetores( ) throws IllegalAccessException {
           Vetor<Pessoa> vetor = new Vetor<Pessoa>();
           JOptionPane.showMessageDialog(null,"Seja bem vindo ao estudo de vetores. Preciso que você \n" +
                                                                    "Cadastre 3 pessoas para contuarmos o estudo");
           for(int i=0;i<vetor.tamanho();i++){
               Pessoa pessoa = new Pessoa();
               String nome = JOptionPane.showInputDialog(null,"Digite o nome da pessoa "+(i+1));
               int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o id da pessoa "+(i+1)));
               pessoa.setNome(nome);
               pessoa.setId(id);
               vetor.inserir(pessoa);
           }
           Pessoa renato = new Pessoa(29,"Renato Russo");
           vetor.inserirEm(1,renato);
           JOptionPane.showMessageDialog(null,
                   "Você nem percebeu, mas o software adicionou uma pessoa ao vetor na posição 1 \n" +
                           "O nome dele é Renato Russo e o id dele é 29 ");
           StringBuilder lista = new StringBuilder();
           lista.append("Lista de pessoas\n");
           for(int i=0;i<vetor.tamanho();i++){
               lista.append("posição-> "+i+" nome: "+vetor.recuperar(i).getNome()+" id: "+vetor.recuperar(i).getId());
               lista.append("\n");
           }
           JOptionPane.showMessageDialog(null,lista.toString());

           Pessoa x = vetor.recuperar(1);
           Pessoa humberto = new Pessoa(160,"Humberto Gessinger");

           JOptionPane.showMessageDialog(null,"Agora o software criou dois novos objetos" +
                   "\n Um  é idêntico a pessoa 2 que vc cadastrou e outro é o Humberto Gessinger, id: 160" +
                   "\n Fizemos isto para testar as funções contem(),indice() e remover.");
        JOptionPane.showMessageDialog(null,"Software, objeto que o usuário cadastrou como pessoa 2 está na vetor?\n"+"Resposta: "+
                vetor.contem(x));
        JOptionPane.showMessageDialog(null,"Software, o Humberto Gessinger que não foi cadastrado está no vetor?\n"+"Resposta: "+
                vetor.contem(humberto));
           lista.delete(0,lista.length());
        JOptionPane.showMessageDialog(null,"Agora vamos testar a função indice()");
        JOptionPane.showMessageDialog(null ,"A posição do Renato Russo "+vetor.indice(renato));

        for(int i=0;i<vetor.tamanho();i++){
            lista.append("posição-> "+i+" nome: "+vetor.recuperar(i).getNome()+" id: "+vetor.recuperar(i).getId());
            lista.append("\n");
        }
        JOptionPane.showMessageDialog(null,"Agora vamos remover a primeira pessoa do vetor.");
        vetor.remover(0);
        JOptionPane.showMessageDialog(null,"Agora vamos remover o Renato Russo do vetor\n" +
                "mas Legião Urbana é muito bom !!!");
        vetor.remover(renato);
        lista.delete(0,lista.length());
        for(int i=0;i< vetor.tamanho();i++){
            lista.append("posição-> "+i+" nome: "+vetor.recuperar(i).getNome()+" id: "+vetor.recuperar(i).getId());
            lista.append("\n");
        }
        JOptionPane.showMessageDialog(null,lista.toString());
        JOptionPane.showMessageDialog(null,"Juntos fizemos uma estrutura de Dados muito famosa: o Vetor\n" +
                "Obrigado pela ajuda,camarada!!!");
    }

}
