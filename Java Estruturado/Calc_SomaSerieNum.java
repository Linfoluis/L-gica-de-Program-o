
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_SomaSerieNum {
    static double X, S, N = 1;
    static double serie;
    public static void main(String[] args) {            
	X = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da série: "));
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
	JOptionPane.showMessageDialog(null,"Série: 1 + 1 / 1 + ... 1 /"+S+" = "+N);
        }
}

