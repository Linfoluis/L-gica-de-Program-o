package lotes.java;

import javax.swing.JOptionPane;

	public class Calc_SomaMetadeFat {
	    public static void main(String[] args) {
	        int A, Fat, N, Cont; 
	        double S = 0;
	        A = Integer.parseInt(JOptionPane.showInputDialog("Entre com um N�mero: "));   
	        Fatorados(A);
	}
	
	static void Fatorados(int A){        
	        int Fat, N, Cont; 
	        double S = 0;
	for (Cont = 1; Cont <= A; Cont++){
	    Fat = 1;
	    N = 1;
	do {
		Fat = Fat * N;
		N = N + 1;
	}
	while (N <= Cont);
		S = S+(1 / Fat);
	}
	JOptionPane.showMessageDialog(null,"O total da s�rie 1 + 1/N...1/"+A+" � de: "+(1+S));
	    }
	}
