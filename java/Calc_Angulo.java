package lotes.java;

import javax.swing.JOptionPane;

	public class Calc_Angulo {
	    public static void main(String[] args) {
	        double a, b;
	            a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro ângulo"));
	            b = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo ângulo"));
	    JOptionPane.showMessageDialog(null, "O valor do terceiro ângulo será de: "+(180-a-b));
	    }
	 
	}
