import javax.swing.JOptionPane;


class Lista2Exercicio4{


public static void main(String args[]){

int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3"));


if (valor1!=valor2 && valor1!=valor3 && valor2!=valor3){
    if (valor1>valor2 && valor1>valor3){
        System.out.println(valor1);
        if (valor2>valor3){
            System.out.println(valor2);
            System.out.println(valor3);
        }else{
            System.out.println(valor3);
            System.out.println(valor2);        
        }
    }else if (valor2>valor1 && valor2>valor3){
        System.out.println(valor2);
        if (valor1>valor3){
            System.out.println(valor1);
            System.out.println(valor3);
        }else{
            System.out.println(valor3);
            System.out.println(valor1);
        }    
    }else{
        System.out.println(valor3);
        if (valor1>valor2){
            System.out.println(valor1);
            System.out.println(valor2);
        }else{
            System.out.println(valor2);
            System.out.println(valor1);
        }
    }

}
}
}
/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Lista2Exercicio4 {
    public static void main(String args[]) {
        
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
        int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3"));

        List<Integer> valores = new ArrayList<Integer>();
        valores.add(valor1);
        valores.add(valor2);
        valores.add(valor3);
        Collections.sort(valores, Collections.reverseOrder()); 
        System.out.println(valores); 
        
    }
}
*/