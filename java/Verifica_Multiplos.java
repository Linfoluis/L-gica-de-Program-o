package lotes.java;

import javax.swing.JOptionPane;

public class Verifica_Multiplos {
    public static void main(String[] args) {
        int A, B;
        A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1º Número: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2º Número: "));
if ((A%B == 0) && (A >= B)) {
   JOptionPane.showMessageDialog(null,A+" é múltiplo de "+B);
    }
else if ((B%A == 0) && (B >= A)){
    JOptionPane.showMessageDialog(null,B+" é múltiplo de "+A);
}
else {
    JOptionPane.showMessageDialog(null,"Nenhum número múltiplo");
}
    }
        }