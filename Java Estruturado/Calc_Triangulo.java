/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Triangulo {
    public static void main(String[] args) {
        int base,altura ;
            base = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Base do Tri�ngulo"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Altura do Tri�ngulo"));
            JOptionPane.showMessageDialog(null,"O Valor da �rea � de: "+((base*altura)/2));
    }
}
