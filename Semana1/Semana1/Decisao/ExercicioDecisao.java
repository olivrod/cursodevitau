import javax.swing.JOptionPane;

public class ExercicioDecisao {
    public static void main (String args[]){
        String nomeProduto = JOptionPane.showInputDialog("Nome do Produto");
        String tipoProduto = JOptionPane.showInputDialog("Tipo do Produto (Alimenticio, Limpeza, Tecnologia");
        float valorProduto = Float.parseFloat(JOptionPane.showInputDialog("Valor do Produto"));
        int qtdeProduto = Integer.parseInt(JOptionPane.showInputDialog("Quantidade do Produto"));

        if (tipoProduto.equalsIgnoreCase("alimenticio")){
            valorProduto = valorProduto * (float) 0.95;
        } else if (tipoProduto.equalsIgnoreCase("tecnologia")){
            valorProduto = valorProduto * (float) 1.08;
        }

        double valorTotal = valorProduto * qtdeProduto;

        if (qtdeProduto > 15){
            float descontoExtra = Float.parseFloat(JOptionPane.showInputDialog("Desconto Extra de %"));
            valorTotal = valorTotal - (valorTotal * (descontoExtra/100));
        }

        System.out.println("Valor total: " + valorTotal);
    }
}