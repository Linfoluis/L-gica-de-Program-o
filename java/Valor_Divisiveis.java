
package lotes.java;

import javax.swing.JOptionPane;

public class Valor_Divisiveis {
    static double A; 
    static double Numdosytres;
    public static void main(String[] args) {
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Escreva entre com um valor: "));
        Numdosytres();
        }
static void Numdosytres(){        
if ((A % 2 != 0) && (A % 3 != 0)) {
        JOptionPane.showMessageDialog(null,"N�mero n�o � divis�vel por 2 e 3");
}
             else {
            JOptionPane.showMessageDialog(null,"� divis�vel por 2 e 3");
        }
    }
}

