
package lotes.java;

import javax.swing.JOptionPane;

public class Nao_Usar2 {
    public static void main(String[] args) {        
    exponencial();
    }
    
static void exponencial(){
    double Cont, X1, Qtde = 0;
        for (Cont = 1; Cont <= 2; Cont++) {
            Qtde = Math.pow(4, (Cont-1));
        }
    JOptionPane.showMessageDialog(null,"Valor é de: "+ Qtde); 
    }
}
