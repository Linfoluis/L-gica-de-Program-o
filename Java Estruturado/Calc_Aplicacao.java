package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Aplicacao {
    public static void main(String[] args) {
        int opcao; double VALOR;
        VALOR = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser aplicado"));
        do {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite: 1 - Poupança | 2 - Renda Fixa | 0 - Sair"));
        switch (opcao){
            case 1:                 
            VALOR = VALOR * 1.03;
            opcao = 0;
            case 2:    
            VALOR = VALOR * 1.05;
            opcao = 0;
            case 0:
            break;
        }
        }
        while (opcao != 0);
            
        JOptionPane.showMessageDialog(null,"Valor do Rendimento é de: R$ "+VALOR+"0");
    }
}