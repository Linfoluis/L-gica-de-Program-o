package lotes.java;

import javax.swing.JOptionPane;
        
public class Soma2num {
    public static void main(String[] args) {
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo valor"));
        
        JOptionPane.showMessageDialog(null, "O Valor da deiferença é de: "+(a-b));
        
    }
    
    
}
