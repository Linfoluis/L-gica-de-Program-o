package lotes.java;

import javax.swing.JOptionPane;

	public class Calc_Angulo {
	    public static void main(String[] args) {
	        double a, b;
	            a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro �ngulo"));
	            b = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo �ngulo"));
	    JOptionPane.showMessageDialog(null, "O valor do terceiro �ngulo ser� de: "+(180-a-b));
	    }
	 
	}
