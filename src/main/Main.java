package main;

import models.Pessoa;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
       menu();
    }
    private static void menu(){
        int x;
        do{
            String menu =
                    "1-Fazer gerenciamento de memória;\n" +
                    "0-Sair"

                    ;
            String strx = JOptionPane.showInputDialog(null,menu);
            x=Integer.parseInt(strx);
            switch(x){
                case 1:
                    gerenciamentoDeMemoria();
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
           JOptionPane.showMessageDialog(null,"Faznedo o gerenciamento usando variáveis int");
           int a =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
           JOptionPane.showMessageDialog(null,"Valor de a: "+a);
           int b=a;
           JOptionPane.showMessageDialog(null,"Agora o software criou a variável b e a ela foi atribuida o valor de a");
           JOptionPane.showMessageDialog(null,"O valor de a é: "+a+"\nO valor de b é: "+b);
           b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um novo valor para b"));
           JOptionPane.showMessageDialog(null,"O valor de a é: "+a+"\nO valor de b é: "+b);
           JOptionPane.showMessageDialog(null,"A é igual a B? \n"+"R: "+(a==b));
           JOptionPane.showMessageDialog(null,"Até aqui tudo bem, nada fora do que já haviamos presvisto.");
           JOptionPane.showMessageDialog(null,"Faznedo o gerenciamento usando variáveis do Tipo Pessoa");
           String nome=JOptionPane.showInputDialog(null,"Digite o nome para a pessoa 1");
           int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um id para a pessoa 1"));
           Pessoa p1 = new Pessoa(id,nome);
           JOptionPane.showMessageDialog(null,"Pessoa 1:\n"+p1.toString());
           Pessoa p2 = p1;
           JOptionPane.showMessageDialog(null,"Agora o software criou um objeto pessoa 2 idêtico ao pessoa 1.");
           JOptionPane.showMessageDialog(null,"Pessoa 1:\n"+p1.toString()+"\nPessoa 2:\n"+p2.toString());
           JOptionPane.showMessageDialog(null,"Agora vamos mudar o nome da pessoa 2 para fazermos um teste.");
           String nome2 = JOptionPane.showInputDialog(null,"Digite um novo nome para pessoa 2");
           p2.setNome(nome2);
           JOptionPane.showMessageDialog(null,"Pessoa 1:\n"+p1.toString()+"\nPessoa 2:\n"+p2.toString());
           JOptionPane.showMessageDialog(null,"Doideiraaaa! O nome dos dois objetos mudaram!!!\nFreud Explica isso???");


    }
}
