package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
		
		if(numero1!=numero2 && numero1!=numero3 && numero2!=numero3) {
			if(numero1>numero2 && numero1>numero3) {
				if(numero2>numero3) {
					System.out.println("Ordem decrescente: " + numero1 + ", "+ numero2 + ", "+ numero3);
				}
				else {
					System.out.println("Ordem decrescente: " + numero1 + ", "+ numero3 + ", "+ numero2);
				}
			}
			else if(numero2>numero1 && numero2>numero3) {
				if(numero1>numero3) {
					System.out.println("Ordem decrescente: " + numero2 + ", "+ numero1 + ", "+ numero3);
				}
				else {
					System.out.println("Ordem decrescente: " + numero2 + ", "+ numero3 + ", "+ numero1);
				}
			}
			else if(numero3>numero1 && numero3>numero2) {
				if(numero2>numero1) {
					System.out.println("Ordem decrescente: " + numero3 + ", "+ numero2 + ", "+ numero1);
				}
				else {
					System.out.println("Ordem decrescente: " + numero3 + ", "+ numero1 + ", "+ numero2);
				}
			}
		}
		else {
			System.out.println("Existem valores iguais!!");
		}
		
	}
}
