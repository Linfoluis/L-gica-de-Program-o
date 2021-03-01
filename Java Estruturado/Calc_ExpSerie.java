
package lotes.java;

import javax.swing.JOptionPane;

public class Calc_ExpSerie {
    public static void main(String[] args) {        
    double exp, Serie = 1;
    int cont;
    
    for (cont = 2; cont <= 15; cont++){
    exp = Math.pow(cont, 2);
        if (cont%2 == 0){
            Serie = (-exp)+Serie;
            JOptionPane.showMessageDialog(null,"O valor da Série 1 - "+cont+" / "+exp+" é: "+Serie);
        }
            else {
                Serie = exp+Serie;
                JOptionPane.showMessageDialog(null,"O valor da Série 1 + "+cont+" / "+exp+" é: "+Serie);
        }
        
}
}
}
