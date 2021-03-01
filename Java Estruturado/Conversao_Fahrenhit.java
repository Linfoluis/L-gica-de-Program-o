/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotes.java;

import javax.swing.JOptionPane;

public class Conversao_Fahrenhit {
    public static void main(String[] args) {
        int celsius;
            celsius = Integer.parseInt(JOptionPane.showInputDialog("Entre com a temperatura em Grau Celsius"));
            JOptionPane.showMessageDialog(null,"O Valor em Fahrenhit é: "+(((9*celsius)+160)/5)+"º Graus");
    }
    
}
