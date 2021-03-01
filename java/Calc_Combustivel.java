package lotes.java;

import javax.swing.JOptionPane;

public class Calc_Combustivel {
   // static int vm;
   // static double time, litro;
    public static void main(String[] args) {
        double time, litro, vm;
        vm  = Integer.parseInt(JOptionPane.showInputDialog("Entre como a velociade em Km/h"));
            time = Double.parseDouble(JOptionPane.showInputDialog("Entre com o tempo do percurso (horas)"));
            Velocidade(vm, time);
    }   
    
    static void Velocidade(double vel, double horas)
        {
            double Vm_Total = (vel*horas)/12;
            JOptionPane.showMessageDialog(null, "O Total de litros gastos será: "+Vm_Total+" Litros");
        }
    }