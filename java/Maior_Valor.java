package lotes.java;

import javax.swing.JOptionPane;

public class Maior_Valor {
    static double A, B;
    static double Mostrar;
public static void main(String[] args) {    
A = Double.parseDouble(JOptionPane.showInputDialog("Entre com o 1� N�mero: "));
B = Double.parseDouble(JOptionPane.showInputDialog("Entre com o 2� N�mero:"));
Mostrar();
}
static void Mostrar(){
if  (A > B) {
  JOptionPane.showMessageDialog(null, "O Maior valor � "+A);
}
  else {
   JOptionPane.showMessageDialog(null,"O Maior valor � "+B);
          }    
        }
}