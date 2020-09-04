import java.util.Scanner;

class VendaProduto {

    public static void main(String args[]) {
       
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o Produto: ");
        String nomeProduto = teclado.next();

        System.out.print("Quantidade do produto: ");
        double qtdeProduto = teclado.nextInt();

        System.out.print("Valor unitario do produto (0,00): ");
        double valorProduto = teclado.nextDouble();

        double valorTotal = qtdeProduto * valorProduto;
        double valorComDesconto = valorTotal * 0.9;

        System.out.println("Produto: " + nomeProduto);
        System.out.printf("Total: R$ %.2f\n", valorTotal);
        System.out.println("Com desconto 10%: R$ " + valorComDesconto);

    }
}