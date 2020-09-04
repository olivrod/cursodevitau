import java.util.Scanner;

class Media{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        // Cast de double pra float pq o java pega o double como padrao
        float media = nota1 * (float) 0.4 + nota2 * (float) 0.6;

        System.out.printf("Media: %.2f", media);
    }
}