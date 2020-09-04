import javax.swing.JOptionPane;

class Media2{
    public static void main(String args[]){

        String aluno = JOptionPane.showInputDialog("Digite o seu nome");

        
        //parse pq o next eh para string
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1"));

        float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2"));

        float media = nota1 * (float) 0.4 + nota2 * (float) 0.6;

        JOptionPane.showMessageDialog(null, "Media: " + media);
    }
}