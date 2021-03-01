/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotes.java;

import javax.swing.JOptionPane;

public class Nao_usar_muitobasico {
    public static void main(String[] args) {
    int x, y;
    x = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor de X"));
    y = Integer.parseInt(JOptionPane.showInputDialog("Insira o Valor de Y"));
            
    JOptionPane.showMessageDialog(null,"O Valor de X é: "+y+"\nO Valor de Y é: "+x);
    }            
}
