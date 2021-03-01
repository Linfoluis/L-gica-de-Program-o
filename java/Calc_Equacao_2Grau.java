package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Equacao_2Grau {
	static int A, B, C;
	static double Delta, X1, X2;
	static double equ_2Grau;
	    
	    public static void main(String[] args) {
	A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1º Número: ")); 
	B = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º Número: ")); 
	C = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 3º Número: "));
	equ_2Grau();
	}
	    
	static void equ_2Grau() {
	Delta = ((Math.pow(B, 2))-(4*A*C));
	if  (Delta > 0) {
	  X1 = (-B + (Math.sqrt(Delta))/2*A);
	  X2 = (-B - (Math.sqrt(Delta))/2*A);
	  JOptionPane.showMessageDialog(null, "X1 = "+X1); 
	  JOptionPane.showMessageDialog(null, "X2 = "+X2); 
	}
	else if (Delta == 0){
	    X1 = (-B + (Math.sqrt(Delta))/2*A);
	    JOptionPane.showMessageDialog(null, "X = "+X1);
	    }
	else{
	      JOptionPane.showMessageDialog(null, "Não existem raízes reais");  
        }
	}
}