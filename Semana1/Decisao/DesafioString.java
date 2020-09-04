import javax.swing.JOptionPane;

public class DesafioString {

    public static void main(String args[]){

        String email = JOptionPane.showInputDialog("Digite seu e-mail").toLowerCase();

        if (email.indexOf("@") > 0){
            System.out.println("Login: " + email.substring(0, email.indexOf("@")));
            System.out.println("Dominio: " + email.substring(email.indexOf("@") + 1, email.length()));
        } else {
            System.out.println("Dados incorretos: " + email);
        }

    }
    
}