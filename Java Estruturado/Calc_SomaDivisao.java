
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_SomaDivisao {
    public static void main(String[] args) {
        double S = 1, N1, N2=0;        
        for (N1 = 2; N1 <= 50; N1++){
            N2 = N1+(N1-1);
            S = S + (N1/N2);
        JOptionPane.showMessageDialog(null,"A Série 1 + "+N1+" / "+N2+" = "+S);
        }
    }
    
}
