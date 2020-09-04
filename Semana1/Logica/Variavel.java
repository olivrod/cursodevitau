import java.util.Scanner;

class Variavel{
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = teclado.next();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Digite sua altura (x,xx): ");
        double altura = teclado.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = teclado.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("IMC: " + imc);

    } // fecha o metodo main
} // fecha a classe