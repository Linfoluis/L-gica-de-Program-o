
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Expoente {
    public static void main(String[] args) {
        int base, expoente;
        base = Integer.parseInt(JOptionPane.showInputDialog("Entre como a base"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Entre como o expoente"));
        JOptionPane.showMessageDialog(null,"O Valor total será¡: "+Math.pow(base, expoente));
    }
    
}
