import java.util.Scanner;

public class ExemploWhile {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu email: ");
        String email = teclado.next().toLowerCase();

        while (email.indexOf("@") < 1){
            System.out.println("Email errado");
            System.out.println("Digite novamente seu email: ");
            email = teclado.next().toLowerCase();
        }
        
    }
}