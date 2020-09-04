import javax.swing.JOptionPane;

public class VotacaoEncadeada {

    public static void main(String args[]) {
        String nome = JOptionPane.showInputDialog("Seu nome");

        byte situacao = Byte.parseByte(JOptionPane.showInputDialog("Voce eh alfabetizado? 1 - Sim / 0 - Nao"));
        if (situacao == 0){
            System.out.println("Analfabeto nao pode votar!");
        } else{
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
}