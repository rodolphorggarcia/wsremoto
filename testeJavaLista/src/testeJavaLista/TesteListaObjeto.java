package testeJavaLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		
		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Nome"),
					JOptionPane.showInputDialog("Nivel"),
					Float.parseFloat(JOptionPane.showInputDialog("Slario"))));
			
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		Collections.sort(lista);
		System.out.println(lista);
		
		/*float total = 0;
		for (Cargo cargo : lista) {
			if(cargo.getNivel().equals("JR")) {
				total+= cargo.getSalario();
			}
			
		}
		
		System.out.println(total);
		System.out.println("Media: " + total/lista.size());*/
	}
	

}
