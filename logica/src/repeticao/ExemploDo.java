package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {

		float salario = 0;
		String cargo = "";
		do {
			cargo = JOptionPane.showInputDialog("Cargo");
			salario = Float.parseFloat(JOptionPane.showInputDialog("Salario"));
			System.out.println(cargo + " / " + salario);
			JOptionPane.showMessageDialog(null, cargo + " / "+ salario);
		}
		while(JOptionPane.showConfirmDialog(
				null, //poderia colocar a tela caso antes criada
				"Deseja continuar", //pergunta
				"Pergunta", //label da pergunta
				JOptionPane.YES_NO_OPTION)==0);

	}
}
