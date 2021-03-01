package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Subtracao2num {
     static int Maior_SubMenor, Total;
        static int A, B;
    public static void main(String[] args) {
        A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro número"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Entre com o segundo núemro"));
        Maior_SubMenor(A, B);
        JOptionPane.showMessageDialog(null,"O Total é: "+Total);
    }
	static void Maior_SubMenor(int A, int B){
	if (A > B) {
	Total = A-B;
	    }
	    else {
	    Total = B-A;
	            }
	}
}
