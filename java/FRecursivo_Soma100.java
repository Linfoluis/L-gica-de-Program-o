// CALCULAR E EXIBIR A SOMA DOS 100 NUMEROS POISITIVOS INTEIROS (1 + 2 + 3 ... + 100)

package lotes.java;

public class FRecursivo_Soma100 {
    public static void main(String[] args) {
    //int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    int N = 1;
        System.out.println("O Valor da soma dos 100 Primeiros Nº(s) é: "+Soma(N));
        
    }
        static int Soma(int Num) {
        int X = Num;
          if (Num != 100) {
            X = X + (Soma(Num+1));
            System.out.println("X: "+X);
                return X;               
            }
                    return 100;
        }
    }
