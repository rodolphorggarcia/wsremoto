package br.com.excecoes.implementacao;

public class testeExcecao {
	/*
	 * Excecoes:
	 * Unchekeds => DC (depois da compilacao)
	 * Checkeds => AC (Antes da compilacao)
	 * */

	public static void main(String[] args) {
		
		try {
			int numero = Integer.parseInt("7");
			System.out.println("Numero: " + numero);
			
			String palavra = null;
			System.out.println("Qtde Caracteres: " + palavra.length());
		}
		catch (NullPointerException e) {
			System.out.println("palabra null");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
