
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Volume {
    public static void main(String[] args) {
        int alt, larg, comp;
        alt = Integer.parseInt(JOptionPane.showInputDialog("Insira a Altura"));
        larg = Integer.parseInt(JOptionPane.showInputDialog("Insira a Largura"));
        comp = Integer.parseInt(JOptionPane.showInputDialog("Insira o Comprimento"));
        
            JOptionPane.showMessageDialog(null,"O Volume é de: "+(larg*alt*comp)+" m³");
    }
    
}
