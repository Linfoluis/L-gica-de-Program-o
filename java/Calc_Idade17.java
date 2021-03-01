package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Idade17 {
    public static void main(String[] args) {
        int ano_Nasc, ano_Atual;
            ano_Nasc = Integer.parseInt(JOptionPane.showInputDialog("Entre com Ano do seu Nascimento"));
                ano_Atual = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Ano Atual"));
        JOptionPane.showInternalMessageDialog(null,"Sua idade daqui a 17 anos será de: "+ ((ano_Atual-ano_Nasc) + 17));
    }
    
}
