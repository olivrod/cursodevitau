import javax.swing.JOptionPane;

public class Votacao {

    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Seu nome");
        short idade = Short.parseShort(JOptionPane.showInputDialog("Sua idade"));

        if (idade < 16){
            System.out.println("Menor de 16 nao pode votar!");
        } else if(idade >= 18 && idade <= 69){
            System.out.println("Seu voto eh obrigatorio!");
        } else {
            System.out.println("Seu voto eh facultativo!");
        }
    }
}