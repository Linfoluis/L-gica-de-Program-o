package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Velocidade {
    public static void main(String[] args) {
        int NV; double MT, VM, TM;
       // DecimalFormat formato = new DecimalFormat("0.00");     
       //   VM = Double.valueOf(formato.format(VM));
       
	NV = Integer.parseInt(JOptionPane.showInputDialog("Entre com o N�mero de Voltas"));
	MT = Integer.parseInt(JOptionPane.showInputDialog("Digite a Extens�o do Circuito em metros?")); 
	TM = Integer.parseInt(JOptionPane.showInputDialog("Qual o tempo de dura��o em minutos?")); 
	VM = (NV*MT)/TM;
	VM = (VM * 3.6);
    
	JOptionPane.showMessageDialog(null,"A Velocidade M�dia � de: "+VM+" Km/h");
    
    }
}
