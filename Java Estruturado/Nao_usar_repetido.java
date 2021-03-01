package lotes.java;

import javax.swing.JOptionPane;
public class Nao_usar_repetido {
    public static void main(String[] args) {
    	//Utilizar valores validos
    	
        Double  A, B, C, delta, Raiz1, Raiz2;
       
        A = Double.parseDouble(JOptionPane.showInputDialog("Entre com o Valor de A"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Entre com o Valor de B"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Entre com o Valor de C"));
        
        delta = (B*B)-(4*A*C);
        Raiz1 = (-B) - ((Math.sqrt(delta))/(2*A));
        Raiz2 = (-B) + ((Math.sqrt(delta))/(2*A));
        
        JOptionPane.showMessageDialog(null, "O Valor da Raiz' é: "+ Raiz1);
        JOptionPane.showMessageDialog(null, "O Valor da Raiz' é: "+ Raiz2);
        
    }
}
