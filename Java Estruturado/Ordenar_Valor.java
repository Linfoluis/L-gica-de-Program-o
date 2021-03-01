package lotes.java;

import javax.swing.JOptionPane;

public class Ordenar_Valor {
    static int A, B = 0;
    static int ordem;
    
    public static void main(String[] args) {
A = Integer.parseInt(JOptionPane.showInputDialog("Entre com o 1º Número: ")); 
do{
B = Integer.parseInt(JOptionPane.showInputDialog("Entre com outro valor")); 
}
while (A == B);
ordem();
}

static void ordem(){
if (A < B) {
   JOptionPane.showMessageDialog(null, A+" - "+B);
}
else {
   JOptionPane.showMessageDialog(null,B+" - "+ A); 
}
}
}