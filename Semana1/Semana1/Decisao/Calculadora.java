import javax.swing.JOptionPane;

public class Calculadora {
    public static void main (String args[]){
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
        char operador = JOptionPane.showInputDialog("Operador: + - / *").charAt(0);

        switch (operador) {
            case '+': 
            System.out.println((float) valor1 + (float) valor2);
            break;
            case '-': 
            System.out.println((float) valor1 - (float) valor2);
            break;
            case '*': 
            System.out.println((float) valor1 * (float) valor2);
            break;
            case '/': 
            System.out.println((float) valor1 / (float) valor2);
            break;
            default:
                System.out.println("Operador incorreto!!!");

        }
        
    }
}