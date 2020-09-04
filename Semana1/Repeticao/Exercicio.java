import javax.swing.JOptionPane;

public class Exercicio {
    public static void main(String args[]){
        String cargo = "", departamento = "";
        float salario = 0, salarioTI = 0, salarioDP = 0, salarioRH = 0;

        char continua = 'S';

        do{
            cargo = JOptionPane.showInputDialog("Cargo");
            departamento = JOptionPane.showInputDialog("Departamento (RH / TI / DP)").toUpperCase();

            do {
                if (!departamento.equals("DP") && !departamento.equals("RH") && !departamento.equals("TI"))
                {
                    departamento = JOptionPane.showInputDialog("Departamento de ser umas das opcoes (RH / TI / DP). Digite novamente!").toUpperCase();
                }
            } while (!departamento.equals("DP") && !departamento.equals("RH") && !departamento.equals("TI"));

            salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
            
            if (departamento.equals("DP")) {
                salarioDP += salario;
            } else if (departamento.equals("RH")) {
                salarioRH += salario;
            } else if (departamento.equals("TI")) {
                salarioTI+= salario;
            }
            
            continua = JOptionPane.showInputDialog("Deseja continuar? S/N").toUpperCase().charAt(0);
        }while (continua == 'S');

        JOptionPane.showMessageDialog(null, "RH salarios: " + salarioRH + "\nDP salarios: " + salarioDP + "\nTI salarios: " + salarioTI);
    }
}