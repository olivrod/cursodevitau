import javax.swing.JOptionPane;

class DecisaoComposta{

    public static void main(String args[]){
        
        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");

        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));

        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));

        float media = (nota1 + nota2)/2;

        System.out.println(nome + " sua media eh: " + media);

        if (media >= 5){
            System.out.println("Aprovado!");
        }else if (media >=3 && media < 5){
            System.out.println("Exame!");
        }else{
            System.out.println("Reprovado!");
        }

    }
    
}