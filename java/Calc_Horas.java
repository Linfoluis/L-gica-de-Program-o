package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Horas {
    public static void main(String[] args) {
        int Hi, Hf, Hd, Mi, Mf, Md;
	do {
	    Hi = Integer.parseInt(JOptionPane.showInputDialog("Entre com as horas de inicio: "));
	}
	while (Hi > 23);
	do {
	    Mi = Integer.parseInt(JOptionPane.showInputDialog("Entre com os minutos  de inicio: "));
	}
	while (Mi > 60);
	do {
	    Hf = Integer.parseInt(JOptionPane.showInputDialog("Entre com as horas finais: "));
	}
	while (Hf > 23);
	do {
	    Mf = Integer.parseInt(JOptionPane.showInputDialog("Entre com os minutos finais: "));
	}
	while (Mf > 60);
	
	if (Hi > Hf) {
	  Hd = (Hf + 24) - Hi;
	}
	  else {
	  Hd = (Hf - Hi);
	}
	          
	if (Mi > Mf) {
	  Hd = (Hd - 1); 
	  Md = (Mf+60)- Mi;
	}
	else{
	    Md = (Mf - Mi);
	}
	  
	JOptionPane.showMessageDialog(null,"O Total de Duração será: "+Hd+":"+Md);
	
   }   
 }
