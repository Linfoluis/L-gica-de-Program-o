package lotes.java;

import javax.swing.JOptionPane;

public class Verifica_Multiplos {
    public static void main(String[] args) {
        int A, B;
        A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1� N�mero: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2� N�mero: "));
if ((A%B == 0) && (A >= B)) {
   JOptionPane.showMessageDialog(null,A+" � m�ltiplo de "+B);
    }
else if ((B%A == 0) && (B >= A)){
    JOptionPane.showMessageDialog(null,B+" � m�ltiplo de "+A);
}
else {
    JOptionPane.showMessageDialog(null,"Nenhum n�mero m�ltiplo");
}
    }
        }