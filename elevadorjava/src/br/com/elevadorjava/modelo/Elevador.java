package br.com.elevadorjava.modelo;

public class Elevador {
	
	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private byte capacidadePessoas;
	private byte qtdeAtual;
	private short andarAtual;
	
	// sintaxe metodo
		//<modificador (public ou private)> <tipo do retorno void, string..> <nomeDoMetodo> (<tipo do parametro> <nome do parametro>)
	
	public void sair(byte pQtde) {
		if(qtdeAtual > pQtde && qtdeAtual != 0){
			qtdeAtual = (byte)(qtdeAtual - pQtde);
		}
	}
	
	public void entrar(byte pQtde){
		if(qtdeAtual < capacidadePessoas) {
			if (pQtde < capacidadePessoas - qtdeAtual) {
				qtdeAtual = (byte)(qtdeAtual + pQtde);
			}
		}
	}
	
	public String exibirDados() {
		return "Nome do elevador: " + nome + " Andar atual: " +  andarAtual + " Quantidade de pessoas atual: " +  qtdeAtual;
		
	}
	
	public void descer() {
		if(andarAtual>andarMinimo) {
			andarAtual--;
		}
	}
	
	public void subir() {
		if(andarAtual < andarMaximo) {
			andarAtual++;
		}
	}
	
	public void definirValores(String pNome, short pAndarMax, short pAndarMin, byte pCapacidade) {
		nome = pNome;
		andarMaximo = pAndarMax;
		andarMinimo = pAndarMin;
		capacidadePessoas = pCapacidade;
	}
	

}
