
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_SomaSerieNum {
    static double X, S, N = 1;
    static double serie;
    public static void main(String[] args) {            
	X = Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero da s�rie: "));
	S = X;
	serie();
	}
	
	static void serie(){
	do {
	N = N+(1/X);
	    System.out.println(N);
	X = X-1;
	}
	while (X > 0);
	JOptionPane.showMessageDialog(null,"S�rie: 1 + 1 / 1 + ... 1 /"+S+" = "+N);
        }
}

