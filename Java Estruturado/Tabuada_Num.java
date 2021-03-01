
package lotes.java;

import javax.swing.JOptionPane;

public class Tabuada_Num {
        static int Cont, N, Tab, tabuada;
            
    public static void main(String[] args) {

        N = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
    tabuada();
    
    }
       static void tabuada(){
        for (Cont = 1; Cont <= 10; Cont++){
        Tab = N * Cont;
        JOptionPane.showMessageDialog(null,N+" x "+Cont+" = "+Tab);
        }
    }
  }

