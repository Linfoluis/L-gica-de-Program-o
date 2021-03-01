package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Salarioliq{
    static double SalarioLiq, P;
    
    static int H, N, V;
    
    public static void main(String[] args) {
        H = Integer.parseInt(JOptionPane.showInputDialog("Entre com as horas trabalhadas"));
        V = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor das horas trabalhadas"));
        P = Double.parseDouble(JOptionPane.showInputDialog("Entre com a porcentagem de desconto"));
        N = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de descendentes"));    
        Salario();
        JOptionPane.showMessageDialog(null, "O Valor total do Salário é de: "+SalarioLiq);
    }
        static void Salario()
        {
        SalarioLiq = (H*V) - (P*0.01) + (N*100);
        }
       
 }
