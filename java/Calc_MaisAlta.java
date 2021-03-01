
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_MaisAlta {
    public static void main(String[] args) {
        double Ana = 1.10, Maria = 1.5;
        int Ano = 0;
        do{
            Ana = Ana + 0.03;
            Maria = Maria + 0.02;
            Ano = Ano + 1;
        }
        while (Ana <= Maria);
        JOptionPane.showMessageDialog(null,"Ana será mais alta que Maria depois de "+Ano+" Anos");
    }
    
}
