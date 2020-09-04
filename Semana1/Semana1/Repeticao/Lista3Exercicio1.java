import javax.swing.JOptionPane;

public class Lista3Exercicio1 {
    public static void main(String args[]){
        char sexo;
        char experiencia;
        short idade = 0, qtdMExp = 0, qtdMSem = 0, qtdFExp = 0, qtdFSem = 0;

        do {
            idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));

            if (idade == 0)
                break;
 
            do {
                sexo = JOptionPane.showInputDialog("Sexo (M / F)").toUpperCase().charAt(0);
            } while (sexo != 'M' && sexo != 'F');

            do {
                experiencia = JOptionPane.showInputDialog("Experiencia (S / N)").toUpperCase().charAt(0);
            } while (experiencia != 'S' && experiencia != 'N');

            if (sexo == 'M' && experiencia == 'S'){
                qtdMExp++;
            } else if (sexo == 'M' && experiencia == 'N'){
                qtdMSem++;
            } else if (sexo == 'F' && experiencia == 'S'){
                qtdFExp++;
            } else if (sexo == 'F' && experiencia == 'N'){
                qtdFSem++;
            }

        } while (idade != 0);

        JOptionPane.showMessageDialog(null, "Total Masculino COM Experiencia: " + qtdMExp + "\nTotal Maculino Sem Experiencia: " + qtdMSem + "\nTotal Feminio COM Experiencia: " + qtdFExp + "\nTotal Femino Sem Experiencia: " + qtdFSem);
    }
}