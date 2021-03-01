
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Redimento {
    public static void main(String[] args) {
        double deposito;
            deposito = Double.parseDouble(JOptionPane.showInputDialog("Entre com o valor do Depósito "));
            JOptionPane.showMessageDialog(null,"O Valor após 1 Mes é de: "+(deposito*1.013));           
    }
    
}
