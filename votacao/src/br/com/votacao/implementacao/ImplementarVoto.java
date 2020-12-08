package br.com.votacao.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;
import br.com.votacao.util.Magic;

public class ImplementarVoto {

	public static void main(String[] args) {
		
		List<Voto> lista = new ArrayList<Voto>();
		Urna urna = new Urna(
				Integer.parseInt(JOptionPane.showInputDialog("Zona")),
				Integer.parseInt(JOptionPane.showInputDialog("Seção")),
				JOptionPane.showInputDialog("Cidade"),
				lista);
		
		do {
			lista.add(new Voto(
					new Eleitor(
							Magic.s("Eleitor"),
							Magic.i("Titulo"),
							Magic.b("Ativo?")),
					new Candidato(
							Magic.s("Canditado"),
							Magic.i("Numero do canditado"),
							Magic.s("Cargo"),
							Magic.s("Partido")),
					Magic.b("Primeiro Turno ?")));
		}while(Magic.b("Continuar ?")==true);
		
		
		System.out.println("CIdade: " + urna.getCidade());
		System.out.println("Secao/zona: " + urna.getSecao() +" / "+ urna.getZona());
		System.out.println("Votos: ");
		
		for (Voto obj : urna.getVotos()) {
			System.out.println("=========================================");
			System.out.println("Nome do Canditado: " + obj.getCanditado().getNome());
			System.out.println("Nome do Eleitor: " + obj.getEleitor().getNome());
			System.out.println("Primeiro Turno: " + obj.isPrimeiroTurno());
			
		}

	}

}
