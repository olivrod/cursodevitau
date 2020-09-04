import javax.swing.JOptionPane;

class Conta{

    public static void main(String args[]){
        
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));

        if (saldo < 0){
            System.out.println("Sua conta esta negativa!");
        }


        if (saldo >= 0 && saldo < 1000){
            System.out.println("Esta sobrando dinheiro");
        }

        System.out.println("Ate logo!!!");
    }
    
}