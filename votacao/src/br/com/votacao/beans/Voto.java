package br.com.votacao.beans;

public class Voto {
	
	private Pessoa eleitor;
	private Pessoa canditado;
	private boolean primeiroTurno;
	
	
	public void setAll(Pessoa eleitor, Pessoa canditado, boolean primeiroTurno) {
		this.eleitor = eleitor;
		this.canditado = canditado;
		this.primeiroTurno = primeiroTurno;
	}
	
	@Override
	public String toString() {
		return "Voto [eleitor=" + eleitor + ", canditado=" + canditado + ", primeiroTurno=" + primeiroTurno + "]";
	}

	public Voto() {
		super();
	}

	public Voto(Pessoa eleitor, Pessoa canditado, boolean primeiroTurno) {
		super();
		this.eleitor = eleitor;
		this.canditado = canditado;
		this.primeiroTurno = primeiroTurno;
	}
	
	public Pessoa getEleitor() {
		return eleitor;
	}
	public void setEleitor(Pessoa eleitor) {
		this.eleitor = eleitor;
	}
	public Pessoa getCanditado() {
		return canditado;
	}
	public void setCanditado(Pessoa canditado) {
		this.canditado = canditado;
	}
	public boolean isPrimeiroTurno() {
		return primeiroTurno;
	}
	public void setPrimeiroTurno(boolean primeiroTurno) {
		this.primeiroTurno = primeiroTurno;
	}
	
	
	

}
