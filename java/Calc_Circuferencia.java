package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Circuferencia {
    public static void main(String[] args) {
	        double r;
	        r = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do Raio"));
	        JOptionPane.showMessageDialog(null, "O valor da circunferência seré de: "+(2*3.14*r));
    }
    
}
