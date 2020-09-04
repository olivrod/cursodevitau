import javax.swing.JOptionPane;

public class DesafioFor {
    public static void main(String args[]){
        
        Integer tabuada = 0;

        tabuada = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada deseja?"));
        
        for (int i = 1; i < 11; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }

        
    }
}