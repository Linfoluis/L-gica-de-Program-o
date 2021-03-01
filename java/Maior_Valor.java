package lotes.java;

import javax.swing.JOptionPane;

public class Maior_Valor {
    static double A, B;
    static double Mostrar;
public static void main(String[] args) {    
A = Double.parseDouble(JOptionPane.showInputDialog("Entre com o 1º Número: "));
B = Double.parseDouble(JOptionPane.showInputDialog("Entre com o 2º Número:"));
Mostrar();
}
static void Mostrar(){
if  (A > B) {
  JOptionPane.showMessageDialog(null, "O Maior valor é "+A);
}
  else {
   JOptionPane.showMessageDialog(null,"O Maior valor é "+B);
          }    
        }
}