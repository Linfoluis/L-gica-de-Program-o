package lotes.java;

import javax.swing.JOptionPane;

public class Calc_ValidaAnoBisexto {
    public static void main(String[] args) {
            int mes, ano, dia, diaN, mesN, anoN;
            int DiaTotal, MesTotal, AnoTotal, Bisexto = 0;
do
    dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Dia atual: "));
while ((dia > 31) || (dia < 1));          
do
    mes = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Mês atual: "));
while ((mes > 12) || (mes < 1));
do
    ano = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Ano atual: "));
while ((ano > 2068) || (ano < 2000));          

do 
diaN = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Dia de Nascimento: "));
while ((diaN > 31) || (diaN < 1));

do
mesN = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Mês de Nascimento: "));

while ((mesN > 12) || (mesN <1));

do
    anoN = Integer.parseInt(JOptionPane.showInputDialog("Entre com a Ano de Nascimento: "));
while ((anoN > 2018) || (anoN < 1850 ) || (ano < anoN));          

AnoTotal = (ano - anoN);

if ((mesN > mes)||((mesN == mes) & (diaN > dia))) {
    AnoTotal = AnoTotal-1;
    MesTotal = ((mes+12)- mesN);
            }
else {
    MesTotal = mes - mesN;
}

if (((anoN % 400 == 0) || (anoN % 4 == 0)) & (anoN % 100 != 0)) {
    Bisexto = 1;
    }
if (((mesN == 2) & (diaN > dia)) & (((anoN % 400 == 0) || (anoN % 4 == 0)) & ((anoN % 100 != 0)))){ 
   DiaTotal =  (dia+29) - diaN;
}
   else if ((mesN == 2) & (diaN > dia)){
      DiaTotal = (dia+28) - diaN;
    }
    else if (((mes == 4) || (mes == 6) || (mes == 9) || (mes == 11)) & (diaN > dia)){
      DiaTotal = (dia+30) - diaN;
      }
      else if (((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes== 10) || (mes == 12)) & (diaN < dia)) {
                   DiaTotal = (dia+31) - diaN;                           
                }
                   else {
                   DiaTotal = dia - diaN;
      }
        

if (Bisexto >= 1){
JOptionPane.showMessageDialog(null,"Total: "+AnoTotal+" anos "+MesTotal+" meses "+DiaTotal+" dias"+ "\nVocê Nasceu em um Ano Bisexto\n");
}
else {
    JOptionPane.showMessageDialog(null,"Total: "+AnoTotal+" anos "+MesTotal+" meses "+DiaTotal+" dias");
        }
    }
}