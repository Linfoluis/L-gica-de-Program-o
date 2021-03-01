package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Vendas {
    public static void main(String[] args) {
        double VM, PA, NVPRECO;
        PA = Double.parseDouble(JOptionPane.showInputDialog("Entre com o Preço atual"));
        VM = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Venda Mensal"));
	if (VM < 500 && PA < 30) {
	    NVPRECO = (PA * 1.1);
	}
	    else if ((VM >= 500) && (VM < 1000) && (PA >= 30) && (PA < 80)) {
	        NVPRECO = PA * 1.15; 
	    }
	    else if (VM >= 1000 && PA >= 80){
	        NVPRECO = PA * 0.95;
	            }
	            else 
	                NVPRECO = PA;
	JOptionPane.showMessageDialog(null,"Valor Total das Vendas em reais é de: R$ "+NVPRECO+"0");    
    }
    
}
