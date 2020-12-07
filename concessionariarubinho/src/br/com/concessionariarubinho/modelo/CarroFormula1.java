package br.com.concessionariarubinho.modelo;

public class CarroFormula1 {
	
	private String cor; 
	private float valor;
	private String escuderia; 
	private float velocidade; 
	private boolean status;
	
	// sintaxe metodo
	//<modificador (public ou private)> <tipo do retorno void, string..> <nomeDoMetodo> (<tipo do parametro> <nome do parametro>)
	
	public void preencherEscuderia(String param){
		escuderia = param.toUpperCase();
	}
	public void preencherCor(String param){
		cor = param.toUpperCase();
	}
	public void preencherValor(float param){
		if(param>0) {
			valor = param;
		}
	}
	public String retornarEscuderia(){
		return escuderia;
	}
	public float retornarValor(){
		return valor;
	}
	public String retornarCor(){
		return cor;
	}
	public String ligar(){
		if (status==true) {
			return "Carro já está ligado";
		}
		status = true;
		return "Carro ligado agora!";
	}
	public String desligar(){
		if(status==false) {
			return "Carro já está desligado";
		}
		status = false;
		velocidade = 0;
		return "Carro desligado!!";
	}
	public void acelerar(float param){
		if(param > 0 && status == true) {
			velocidade += param;
		}
	}	
	public void brecar(){
		if(status==true) {
			velocidade=0;
		}
	}
	public float retornarVelocidade() {
		return velocidade;
	}
}
