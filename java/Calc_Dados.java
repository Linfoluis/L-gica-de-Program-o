
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Dados {
    public static void main(String[] args) {
        int dado1, dado2, Sete;
        for (dado1 = 1; dado1 <= 8; dado1++){
            for (dado2 = 1; dado2 <=8; dado2++){
                if (dado1 + dado2 == 7){
                    JOptionPane.showMessageDialog(null,"A soma dos dados quando:\n Dado A = "+dado1+" e Dado B = "+dado2+" é Sete");
                }
    }
  }
}
}
