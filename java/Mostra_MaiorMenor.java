
package lotes.java;

import javax.swing.JOptionPane;

public class Mostra_MaiorMenor {
     static int  Maior = 0, Menor = 0;
    public static void main(String[] args) {
        int N, Cont;
        for (Cont = 1; Cont <= 100; Cont++){
            N = Integer.parseInt(JOptionPane.showInputDialog("Entre com o "+Cont+"º número: "));
         Maior_Menor(N, Cont);   
        }
    }

static void Maior_Menor(int N, int Cont){
            if (Cont == 1) {
            Maior = N;
            Menor = N;
            }
        if (N > Maior){
        Maior = N;
        }
            else if (N < Menor) {
            Menor = N;
            }
JOptionPane.showMessageDialog(null,"O maior valor é: "+Maior+" e o Menor é: "+Menor);
        }
}
