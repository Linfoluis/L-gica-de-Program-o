package lotes.java;

import javax.swing.JOptionPane;

public class Hipotenusa {
    public static void main(String[] args) {
        double c1, c2, hipt;
            c1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o cateto 1"));
                c2 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o cateto 2"));
                    JOptionPane.showMessageDialog(null, "O valor da hipotenusa será de: "+(Math.sqrt(c1+c2)));
    }
    
}
