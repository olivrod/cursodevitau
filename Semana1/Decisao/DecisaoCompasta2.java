import javax.swing.JOptionPane;

class DecisaoCompasta2{

    public static void main(String args[]){
        
        float saldo = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo"));

        if (saldo < 0){
            System.out.println("Sua conta esta negativa!");
        } else if (saldo > 1000){
            System.out.println("Esta sobrando dinheiro");
        } else {
            System.out.println("Sua conta esta normal");
        }

        System.out.println("Ate logo!!!");
    }
    
}