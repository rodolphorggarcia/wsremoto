package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		String equacao = JOptionPane.showInputDialog("Entre com o tipo de equacao, opcoes (+ - * /)");
		if(equacao.equals("+")) {
			System.out.println("O resultado �: " + (numero1+numero2));
		}
		else if(equacao.equals("/")) {
			if(numero2!=0) {
				System.out.println("O resultado �: " + (numero1/numero2));
			}
			else {
				System.out.println("O segundo valor eh igual a 0, nao podemos dividir por 0.");
			}
		}
		else if(equacao.equals("-")) {
			System.out.println("O resultado �: " + (numero1-numero2));
		}
		else if(equacao.equals("*")) {
			System.out.println("O resultado �: " + (numero1*numero2));
		}
		else {
			System.out.println("Informe uma opcao valida, opcoes (+ - * /)");
		}
	}
}

/*
char equacao = JOptionPane.showInputDialog("Digite um operador").charAt(0);
if (resposta == '+') {
	
}
*/