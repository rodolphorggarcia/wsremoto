package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {
		String nome = "";
		int idade = 0;
		int contadorMaiores = 0;
		int contador = 0;
		float media = 0;
		int menorIdade = 0;
		int maiorIdade = 0;
		String nomeMaiorIdade = "";
		String nomeMenorIdade = "";
		do {
			nome = JOptionPane.showInputDialog("Entre com o nome").toUpperCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade"));
			contador++;
			media = media + idade;
			if (idade > 18) {
				contadorMaiores++;
			}
			if (idade > maiorIdade) {
				maiorIdade = idade;
				nomeMaiorIdade = nome;
			}
			if (idade < menorIdade || contador==1) {
				menorIdade = idade;
				nomeMenorIdade = nome;
			}
			System.out.println(nome + " / " + idade);
		}while(JOptionPane.showConfirmDialog(
				null, 
				"Deseja continuar", 
				"Pergunta",
				JOptionPane.YES_NO_OPTION)==0);
		System.out.println("O numero de maiores de idade �: "+ contadorMaiores);
		System.out.printf("A media das idades � %.2f: \n", media/contador);
		System.out.println("A maior idade �: "+ maiorIdade + " - " + nomeMaiorIdade);
		System.out.println("A menor idade �: "+ menorIdade + " - " + nomeMenorIdade);
	}
}