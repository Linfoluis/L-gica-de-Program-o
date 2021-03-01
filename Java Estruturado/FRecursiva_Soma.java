// Coletar um número inteiro positivo. Calcule e mostre as séries:
// Série 1: N + (N-1) + (N-2) ... N + (1);
// Série 2: 1/N + 1/(N-1) + 1/(N-2) ... N + 1/1;
// Série 3: 
// Série 4:
// Série 5: 
package lotes.java;

import javax.swing.JOptionPane;

public class FRecursiva_Soma { 
    public static void main(String[] args) {
        int N;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        System.out.println("O Valor da Série 1 será: "+serie1(N));
        System.out.println("O Valor da Série 2 será: "+serie2(N));
        System.out.println("O Valor da Série 3 será: "+serie3(N));
    }   
    static int serie1(int Num) {
        int X = Num;
        if (Num != 1) {
        X = X + serie1(Num-1);
            return X;
}
        return 1;
}
    static double serie2(double Num) {
        double X;
        if (Num != 1){
            X = (1 / Num) + serie2(Num-1);
                return X;
        }
        return 1;
    }
    static double serie3(double Num) {
        double X;
        if (Num != 1){
            X = (1 / Num) + serie2(Num-1);
                return X;
        }
        return 1;
    }
}

