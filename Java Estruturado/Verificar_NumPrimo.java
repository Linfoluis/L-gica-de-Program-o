
package lotes.java;
import javax.swing.JOptionPane;

public class Verificar_NumPrimo {
    public static void main(String[] args) {
    int  N1, N2;
 	N1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1� N�mero: "));
    N2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 2� N�mero: "));
    Primos(N1, N2);
    }
    
    static void Primos(int N1, int N2){
    int Cont;
    if (N1 > N2) {
    Cont = N2;
    N2 = N1;
    N1 = Cont;
    }
        for (Cont = N1; Cont <= N2; Cont++){
        if ((Cont == 2) || (Cont == 3) || (Cont == 5) || (Cont == 7)){
           JOptionPane.showMessageDialog(null,"N�mero: "+Cont+" � Primo");
        }
        else if ((((Cont % 2) != 0) || ((Cont % 3) != 0) || ((Cont % 5) != 0) || ((Cont % 7) != 0)) && (Cont > 1)){
        JOptionPane.showMessageDialog(null,"N�mero: "+Cont+" N�o � Primo");
     }           
   }     
  }
}