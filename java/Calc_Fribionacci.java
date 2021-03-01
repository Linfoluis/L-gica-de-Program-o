package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Fribionacci {
    public static void main(String[] args) {
    int N;
	N = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
	Fibronacci(N);
}
    
	public static void Fibronacci(int N){
	int X1 = 1, X2 = 0, F = 0, Cont;
	
	for (Cont = 1; Cont <= N; Cont++) {
		F = X1 + X2; 
		X2 = X1; 
		X1 = F;
		JOptionPane.showMessageDialog(null,"Fribionacci "+Cont+" é: "+F);
        }
    }
}
