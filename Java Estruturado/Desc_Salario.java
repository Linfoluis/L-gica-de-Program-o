/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotes.java;

import javax.swing.JOptionPane;

public class Desc_Salario {
    public static void main(String[] args) {
    int salario;
            salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu salário"));
            JOptionPane.showMessageDialog(null, "O Valor com desconto de 15% é de: "+(salario*0.75+" Reais"));
    }
       
}
