
package lotes.java;

import javax.swing.JOptionPane;

public class Contagem_Impares {
    public static void main(String[] args) {        
    int A, B, Res, Cont, Impar = 0;
    A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1º Número: "));
    B = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º Número: "));
    Impares(A, B);
    }
    
    static void Impares(int A, int B){
    int Res, Cont, Impar = 0;
	
		if (A > B) {
		    Res = A-B;
		}
		    else {
		        Res = B-A;
		}
		
		for (Cont = 1; Cont <= Res; Cont++) {
			if (Cont % 2 != 0) {
				Impar = Cont + Impar;
			}
		}
		JOptionPane.showMessageDialog(null, "O Total da soma de números impares é de: "+Impar);
    }
}

 
