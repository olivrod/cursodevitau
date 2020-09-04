import java.util.Scanner;

public class DesafioWhile {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite dia: ");
        int dia = teclado.nextInt();

        System.out.println("Digite mes: ");
        int mes = teclado.nextInt();

        System.out.println("Digite ano: ");
        int ano = teclado.nextInt();


        // verificaro dia mes e ano (1920 < ano < 2002)
        while (dia < 1 || dia > 31){
            System.out.println("Dia invalido");
            System.out.println("Digite novamente o dia: ");
            dia = teclado.nextInt();
        }

        while (mes < 1 || mes > 12){
            System.out.println("Mes invalido");
            System.out.println("Digite novamente o mes: ");
            mes = teclado.nextInt();
        }

        while (ano < 1920 || ano > 2002){
            System.out.println("Ano invalido");
            System.out.println("Digite novamente o ano: ");
            ano = teclado.nextInt();
        }

        System.out.println("Data: " + dia + "/" + mes + "/" + ano);

    }
}