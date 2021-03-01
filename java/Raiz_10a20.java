package lotes.java;

import javax.swing.JOptionPane;

public class Raiz_10a20 {
    public static void main(String[] args) {
         int Cont = 10, raiz;
            do {
            raiz = (Cont*Cont);
            JOptionPane.showMessageDialog(null,"O quadrado de "+Cont+" é de "+raiz);
            Cont = Cont+1;
                    }
            while ((Cont >= 10) && (Cont <= 20));

    }
    
}
