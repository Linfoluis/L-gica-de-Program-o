package lotes.java;

import javax.swing.JOptionPane;

public class NaoUtilizavel {
    public static void main(String[] args) {
    double kg, dur;
        kg = Double.parseDouble(JOptionPane.showInputDialog("Entre com o peso"));
        JOptionPane.showMessageDialog(null, "A duração será de: "+(kg/0.05)+" dias");
    }
}
