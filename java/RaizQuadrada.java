/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotes.java;

import javax.swing.JOptionPane;

public class RaizQuadrada {
    public static void main(String[] args) {
        int lado;
        lado = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor"));
        JOptionPane.showMessageDialog(null, "O Valor da Área do quadrado é: "+(lado*lado)+" m²");
    }
}

