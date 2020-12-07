package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		short ano = Short.parseShort(JOptionPane.showInputDialog("ANO (maior que 1900):"));
		while(ano <= 1900) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite um ano maior ou igual a  1900"));
		}
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("MES (Entre 1 e 12):"));
		while(mes<1 ||mes > 12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite um mês de 1 a 12"));
		}
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			byte dia = Byte.parseByte(JOptionPane.showInputDialog("DIA:"));
			while(dia < 0 || dia > 31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite um dia entre 1 e 31"));
			}
			System.out.println("Data: " + dia + "/" + mes + "/"+ ano);
		}
		else if(mes==2){
			byte dia = Byte.parseByte(JOptionPane.showInputDialog("DIA:"));
			while(dia < 0 || dia > 28) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite um dia entre 1 e 28"));
			}
			System.out.println("Data: " + dia + "/" + mes + "/"+ ano);
		}
		else if(mes==4 || mes==6 || mes==9 || mes==11){
			byte dia = Byte.parseByte(JOptionPane.showInputDialog("DIA:"));
			while(dia < 0 || dia > 30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite um dia entre 1 e 30"));
			}
			System.out.println("Data: " + dia + "/" + mes + "/"+ ano);
		}	
	}
}
