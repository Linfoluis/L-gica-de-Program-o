package lotes.java;

import javax.swing.JOptionPane;


public class Funcao_Recursiva {
      
    public static void main(String[] args) {
    int N;
     
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        JOptionPane.showMessageDialog(null, recursivo1(N));
    }
    
    static int recursivo1(int Num) {
    int X, Cont;
    
    if (Num != 1) {
        X = Num * (recursivo1(Num-1));
//        System.out.println(X);
            return X;
                    }
                return 1;
        }
    }
        
    
    
    //for (Cont = Num; Cont >= 1; Cont--) {
    //    System.out.println("Contador "+Cont);
    //        X = (X*Cont);
    //}
    //    return X;
//}

//}