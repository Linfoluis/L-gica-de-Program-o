
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Redimento {
    public static void main(String[] args) {
        double deposito;
            deposito = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do Dep�sito "));
            JOptionPane.showMessageDialog(null,"O Valor ap�s 1 Mes � de: "+(deposito*1.013));           
    }
    
}
