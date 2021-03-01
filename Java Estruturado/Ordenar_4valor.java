package lotes.java;

import javax.swing.JOptionPane;

public class Ordenar_4valor {
        static int A, B, C, D; 
        static int NumMaior;
    public static void main(String[] args) {
    
A = Integer.parseInt(JOptionPane.showInputDialog("1 - Entre com um Número: ")); 
do {
B = Integer.parseInt(JOptionPane.showInputDialog("2 - Entre com um valor maior que o anterior"));
} while (A>B);
do {
C = Integer.parseInt(JOptionPane.showInputDialog("3 - Entre com um valor maior que o anterior"));
} while (B>C);
D = Integer.parseInt(JOptionPane.showInputDialog("4 - Entre com um valor qualquer"));
NumMaior();
}

static void NumMaior()  {
if  (D < A)
  JOptionPane.showMessageDialog(null, D +" - "+A+" - "+B+" - "+C); 
    else if (D < B)
        JOptionPane.showMessageDialog(null, A +" - "+D+" - "+B+" - "+C); 
        else if  (D < C)
             JOptionPane.showMessageDialog(null, A +" - "+B+" - "+D+" - "+C); 
                else
                    JOptionPane.showMessageDialog(null, A +" - "+B+" - "+C+" - "+D); 
    }
}
