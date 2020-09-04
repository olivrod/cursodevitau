import javax.swing.JOptionPane;

public class Lista3Exercicio5 {
    public static void main(String args[]){
        int cidade1 = 0, cidade2 = 0, cidade3 = 0, cidade4 = 0, cidade5 = 0;
        int veiculos1 = 0, veiculos2 = 0, veiculos3 = 0, veiculos4 = 0, veiculos5 = 0;
        int acidentes1 = 0, acidentes2 = 0,  acidentes3 = 0,  acidentes4 = 0,  acidentes5 = 0;

        cidade1 = Integer.parseInt(JOptionPane.showInputDialog("Codigo da cidade 1"));
        veiculos1 = Integer.parseInt(JOptionPane.showInputDialog("Veiculos da cidade 1"));
        acidentes1 = Integer.parseInt(JOptionPane.showInputDialog("Acidentes da cidade 1"));

        cidade2 = Integer.parseInt(JOptionPane.showInputDialog("Codigo da cidade 2"));
        veiculos2 = Integer.parseInt(JOptionPane.showInputDialog("Veiculos da cidade 2"));
        acidentes2 = Integer.parseInt(JOptionPane.showInputDialog("Acidentes da cidade 2"));

        cidade3 = Integer.parseInt(JOptionPane.showInputDialog("Codigo da cidade 3"));
        veiculos3 = Integer.parseInt(JOptionPane.showInputDialog("Veiculos da cidade 3"));
        acidentes3 = Integer.parseInt(JOptionPane.showInputDialog("Acidentes da cidade 3"));

        cidade4 = Integer.parseInt(JOptionPane.showInputDialog("Codigo da cidade 4"));
        veiculos4 = Integer.parseInt(JOptionPane.showInputDialog("Veiculos da cidade 4"));
        acidentes4 = Integer.parseInt(JOptionPane.showInputDialog("Acidentes da cidade 4"));

        cidade5 = Integer.parseInt(JOptionPane.showInputDialog("Codigo da cidade 5"));
        veiculos5 = Integer.parseInt(JOptionPane.showInputDialog("Veiculos da cidade 5"));
        acidentes5 = Integer.parseInt(JOptionPane.showInputDialog("Acidentes da cidade 5"));

        if (acidentes1 > acidentes2 && acidentes1 > acidentes3 && acidentes1 > acidentes4 && acidentes1 > acidentes5)
        {
            JOptionPane.showMessageDialog(null, "Maior indice de acidente é da Cidade : " + cidade1 + " com " + acidentes1);
        }
        if (acidentes2 > acidentes1 && acidentes2 > acidentes3 && acidentes2 > acidentes4 && acidentes2 > acidentes5)
        {
            JOptionPane.showMessageDialog(null, "Maior indice de acidente é da Cidade : " + cidade2 + " com " + acidentes2);
        }
        if (acidentes3 > acidentes1 && acidentes3 > acidentes2 && acidentes3 > acidentes4 && acidentes3 > acidentes5)
        {
            JOptionPane.showMessageDialog(null, "Maior indice de acidente é da Cidade : " + cidade3 + " com " + acidentes3);
        }
        if (acidentes4 > acidentes2 && acidentes4 > acidentes3 && acidentes4 > acidentes1 && acidentes4 > acidentes5)
        {
            JOptionPane.showMessageDialog(null, "Maior indice de acidente é da Cidade : " + cidade4 + " com " + acidentes4);
        }
        if (acidentes5 > acidentes2 && acidentes5 > acidentes3 && acidentes5 > acidentes4 && acidentes5 > acidentes1)
        {
            JOptionPane.showMessageDialog(null, "Maior indice de acidente é da Cidade : " + cidade5 + " com " + acidentes5);
        }

        if (acidentes1 < acidentes2 && acidentes1 < acidentes3 && acidentes1 < acidentes4 && acidentes1 < acidentes5)
        {
            JOptionPane.showMessageDialog(null, "Menor indice de acidente é da Cidade : " + cidade1 + " com " + acidentes1);
        }
        if (acidentes2 < acidentes1 && acidentes2 < acidentes3 && acidentes2 < acidentes4 && acidentes2 < acidentes5)
        {
            JOptionPane.showMessageDialog(null, "Menor indice de acidente é da Cidade : " + cidade2 + " com " + acidentes2);
        }
        if (acidentes3 < acidentes1 && acidentes3 < acidentes2 && acidentes3 < acidentes4 && acidentes3 < acidentes5)
        {
            JOptionPane.showMessageDialog(null, "Menor indice de acidente é da Cidade : " + cidade3 + " com " + acidentes3);
        }
        if (acidentes4 < acidentes2 && acidentes4 < acidentes3 && acidentes4 < acidentes1 && acidentes4 < acidentes5)
        {
            JOptionPane.showMessageDialog(null, "Menor indice de acidente é da Cidade : " + cidade4 + " com " + acidentes4);
        }
        if (acidentes5 < acidentes2 && acidentes5 < acidentes3 && acidentes5 < acidentes4 && acidentes5 < acidentes1)
        {
            JOptionPane.showMessageDialog(null, "Menor indice de acidente é da Cidade : " + cidade5 + " com " + acidentes5);
        }

        float mediaVeiculos = (veiculos1 + veiculos2 + veiculos3 + veiculos4 + veiculos5) / 5;



        
    }
}