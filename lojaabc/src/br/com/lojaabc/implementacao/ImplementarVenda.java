package br.com.lojaabc.implementacao;

import br.com.lojaabc.modelo.Cliente;
import br.com.lojaabc.modelo.Venda;

public class ImplementarVenda {

	public static void main(String[] args) {
		
		Venda venda = new Venda();
		
		
		venda.setQtde(10);
		venda.getProduto().setValorVenda(1500);
		venda.getProduto().getFabricante().setCnpj("123456");
		System.out.println(venda.getProduto().getFabricante().getCnpj());
		
		
		Cliente cliente = new Cliente();
		cliente.setEmail("cliente@gmail.com");
		venda.setCliente(cliente);
		

	}

}
