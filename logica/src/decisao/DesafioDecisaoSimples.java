package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));

		
		if(idade >= 18 && idade <=70 ) {
			System.out.println(nome + ", você é obrigado a votar.");
			
		}
		else if(idade < 16) {
			System.out.println(nome+ ", você não pode votar!!");
			
		}
		else {
			System.out.println(nome + ", seu voto é facultativo");
			
		}
		
		System.out.println("Sua idade é: "+ idade + " anos!!");

	}

}
