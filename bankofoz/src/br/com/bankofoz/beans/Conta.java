package br.com.bankofoz.beans;

/*
 * Polimorfismo: � o quarto pilar da OO. Que permite deixarmos m�todos com o mesmo nome, realizando operacoes diferentes.
 * Dois tipos:
 * = Overload(sobrecarga) = > os metodos estao na mesma classe
 * = Override (sobreescrita) = > os mestodos estao em classes diferentes
 * */

public abstract class Conta {
	
	private short numero;
	private byte digito;
	private short agencia;
	private float saldo;
	private Cliente cliente;
	
	public float getLimite() {
		return 0;
	}
	public void setLimite(float limite) {
		
	}
	public float getTaxa() {
		return 0;
	}
	public void setTaxa(float taxa) {
		
	}
	
	public void aumentarLimite(float porc) {

	}
	
	public void debitarTaxa() {
		
	}
	
	public float verificarSaldo() {
		return 0;
	}
	
	
	public void setRendimento(float rendimento) {
		
	}
	
	public float getRendimento() {
		return 0;
	}
	
	
	public boolean depositar(float valor) {
		if(valor>0) {
			this.saldo = saldo+valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sacar(float valor) {
		if(valor>0 && valor<=saldo) {
			this.saldo = saldo - valor;  //saldo-=valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Conta() {
		
	}

	public Conta(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", digito=" + digito + ", agencia=" + agencia + ", saldo=" + saldo
				+ ", cliente=" + cliente + "]";
	}
	

	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}
	public byte getDigito() {
		return digito;
	}
	public void setDigito(byte digito) {
		this.digito = digito;
	}
	public short getAgencia() {
		return agencia;
	}
	public void setAgencia(short agencia) {
		this.agencia = agencia;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

}
