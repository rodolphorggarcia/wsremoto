package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));

		
		if(idade >= 18 && idade <=70 ) {
			System.out.println(nome + ", voc� � obrigado a votar.");
			
		}
		else if(idade < 16) {
			System.out.println(nome+ ", voc� n�o pode votar!!");
			
		}
		else {
			System.out.println(nome + ", seu voto � facultativo");
			
		}
		
		System.out.println("Sua idade �: "+ idade + " anos!!");

	}

}
