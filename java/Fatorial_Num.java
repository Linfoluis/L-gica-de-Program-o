
package lotes.java;
import javax.swing.JOptionPane;

public class Fatorial_Num {
    public static void main(String[] args) {
        int Cont, N, Fat;
        N = Integer.parseInt(JOptionPane.showInputDialog("Entre com um Número"));      
        Fat = 1;
        for (Cont = 1; Cont <= N; Cont++) {
            Fat = (Fat * Cont);
        }
        JOptionPane.showMessageDialog(null,"O fatorial do número "+N+" é de "+Fat);

    }
    
}
