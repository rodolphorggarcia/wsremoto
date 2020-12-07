package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		String cliente = JOptionPane.showInputDialog("Nome do Cliente").toUpperCase();
		float numeroDiarias = Float.parseFloat(JOptionPane.showInputDialog("Numero de diarias"));
		if (numeroDiarias > 15){
			System.out.println(cliente + ", o valor a pagar é: " + ((numeroDiarias *5.5)+ (80 *numeroDiarias)) + " reais");
		}
		else if(numeroDiarias == 15){
			System.out.println(cliente + ", o valor a pagar é: " + ((numeroDiarias *6)+ (80 *numeroDiarias)) + " reais");
		}
		else {
			System.out.println(cliente + ", o valor a pagar é: " + ((numeroDiarias *8)+ (80 *numeroDiarias)) + " reais");
		}	
	}
}

/*
short diarias = Short.parseShort(JOptionPane.showInputDialog("Diárias"));
float taxa = (float) 5.5;
if (diarias == 15) {
	taxa = 6;
} else if (diarias<15) {
	taxa = 8;
}
System.out.println("Total: " + ((80+taxa) * diarias));*/