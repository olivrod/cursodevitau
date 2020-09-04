import javax.swing.JOptionPane;

public class DesafioDo {
    public static void main(String args[]){
        String jogador1 = "";
        int numeroSecreto = 0;
        String jogador2 = "";
        int numeroTentativa = 0;

        jogador1 = JOptionPane.showInputDialog("Digite o nome do jogador 1").toUpperCase();
        numeroSecreto = Integer.parseInt(JOptionPane.showInputDialog(jogador1 + " digite o numero secreto"));

        jogador2 = JOptionPane.showInputDialog("Digite o nome do jogador 2").toUpperCase();

        int tentativas = 0;
        do{
            tentativas++;
            numeroTentativa = Integer.parseInt(JOptionPane.showInputDialog(jogador2 + " chute um numero"));
            if (numeroTentativa < numeroSecreto){
                JOptionPane.showMessageDialog(null, jogador2 + " chutou Baixo!");
            }
            else if(numeroTentativa > numeroSecreto){
                JOptionPane.showMessageDialog(null, jogador2 + " chutou ALTO!");
            }
        }while (numeroSecreto != numeroTentativa);

        JOptionPane.showMessageDialog(null, jogador2 + ", parabens! Voce advinhou o numero secreto em " + tentativas + " tentativas!!!");
    }
}