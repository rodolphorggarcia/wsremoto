package br.com.elevadorjava.testes;

import br.com.elevadorjava.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		
		Elevador objeto = new Elevador();
		
		System.out.println(objeto.exibirDados());
		objeto.definirValores("elevador", (short)10, (short)0, (byte)20);
		objeto.entrar((byte)5);
		objeto.subir();
		objeto.subir();
		objeto.entrar((byte)8);
		System.out.println(objeto.exibirDados());
		objeto.descer();
		System.out.println(objeto.exibirDados());
		
	}

}
