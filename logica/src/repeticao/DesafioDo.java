package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {
	
		int jogador1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 digite o primeiro numero"));
		int jogador2 = 0;
		int contador = 0;
		do {
			jogador2 = Integer.parseInt(JOptionPane.showInputDialog("Jodagor 2 descubra o numero digitado"));
			if (jogador2 > jogador1) {
				JOptionPane.showMessageDialog(null,"O numero que o jogador um jogou � mais baixo");
			}
			else if(jogador2<jogador1){
				JOptionPane.showMessageDialog(null,"O numero que o jogador um jogou � mais alto");
			}
			contador++;
			
		}while(jogador1!=jogador2);
		JOptionPane.showMessageDialog(null,"Parabens voce acertou na "+ contador + "� tentativa!!");
	}
}
