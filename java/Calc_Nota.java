package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Nota {
    public static void main(String[] args) {
        int Media, A, B, C, D;
	A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1º Número: ")); 
	B = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º Número: "));
	C = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º Número: "));
	D = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º Número: "));
	Media = (A+B+C+D)/4;
	if  (Media >= 6) {
	  JOptionPane.showMessageDialog(null,"Aprovado"); 
	}
	else if (((Media < 6) & (Media > 3))) {
	    JOptionPane.showMessageDialog(null,"Exame");
	}
	      else  {
	    JOptionPane.showMessageDialog(null,"Reprovado");
	}      
 
    }
    
}
