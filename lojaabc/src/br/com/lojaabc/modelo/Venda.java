package br.com.lojaabc.modelo;


public class Venda {
	private int NotaFiscal;
	private Produto produto;
	private Cliente cliente;
	private int qtde;
	private float total;
	
	
	public void calcularTotal() {
		if(cliente.isEspecial()==true) {
			total = produto.getValorVenda() * (float)0.95 * qtde;
		}
		else {
			total = produto.getValorVenda() * qtde;
		}
	}

	@Override
	public String toString() {
		return "Venda [NotaFiscal=" + NotaFiscal + ", produto=" + produto + ", cliente=" + cliente + ", qtde=" + qtde
				+ ", total=" + total + "]";
	}
	
	public Venda(){
		
	}

	public Venda(int notaFiscal, Produto produto, Cliente cliente, int qtde, float total) {
		super();
		NotaFiscal = notaFiscal;
		this.produto = produto;
		this.cliente = cliente;
		this.qtde = qtde;
		this.total = total;
	}

	public int getNotaFiscal() {
		return NotaFiscal;
	}

	public void setNotaFiscal(int notaFiscal) {
		NotaFiscal = notaFiscal;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	/*public void calcularTotal(float valorVenda) {
		if (this.cliente.isEspecial()) {
			valorVenda -= valorVenda*0.05;
			this.produto.setValorVenda(valorVenda);
		}else {
			this.produto.setValorVenda(valorVenda);
		}
	}*/

}
