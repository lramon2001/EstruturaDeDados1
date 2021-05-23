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
           int a =Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
           JOptionPane.showMessageDialog(null,"Valor de a: "+a);
           int b=a;
           JOptionPane.showMessageDialog(null,"Agora o software criou a variável b e a ela foi atribuida o valor de a");
           JOptionPane.showMessageDialog(null,"O valor de a é: "+a+"\nO valor de b é: "+b);
           b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um novo valor para b"));


    }
}
