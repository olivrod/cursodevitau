import javax.swing.JOptionPane;

public class ManipulaString {

    public static void main(String args[]){

        String nome = JOptionPane.showInputDialog("Digite seu nome");

        System.out.println("Original: " + nome);

        System.out.println("Maiuscula: " + nome.toUpperCase());

        System.out.println("Minusculo: " + nome.toLowerCase());

        System.out.println("Qntde caracteres: " + nome.length());

        System.out.println("Comparacao: " + nome.equals("XPTO"));

        System.out.println("Comparacao Ignorando Caixa: " + nome.equalsIgnoreCase("XPTO"));

        System.out.println("3 primeiros caracteres: " + nome.substring(0,3));

        System.out.println("Da posicao 2 em diante (comeaca no zero): " + nome.substring(2));

        System.out.println("Primeira metade do nome: " + nome.substring(0, nome.length()/2));
        
        // retorna -1 caso nao encontra
        System.out.println("Posicao da letra D: " + nome.toUpperCase().indexOf("D"));
    }
    
}