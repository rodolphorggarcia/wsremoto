package br.com.exercicios.implementacao;

import br.com.execicioVenda.utils.Magic;
import br.com.exercicios.PessoaFisica;
import br.com.exercicios.PessoaJuridica;

public class ImplementarCliente {

	public static void main(String[] args) {
		
		char opcao = Magic.s("Digite F para pessoa f�sica").charAt(0);
		if(opcao=='F') {
			PessoaFisica cliente = new PessoaFisica();
			cliente.setNome(Magic.s("Nome"));
			cliente.setCpf(Magic.s("CPF"));
			cliente.setEmail(Magic.s("Email").toLowerCase());
			cliente.setEspecial(Magic.b("Cliente Especial ?"));
			cliente.setId(Magic.i("Codigo"));
			cliente.setNascimento(Magic.s("Nascimento"));
			cliente.setRg(Magic.s("RG"));
			System.out.println(cliente.toString());
		}
		else {
			PessoaJuridica cliente = new PessoaJuridica();
			cliente.setNome(Magic.s("Nome"));
			cliente.setEmail(Magic.s("Email").toLowerCase());
			cliente.setEspecial(Magic.b("Cliente Especial ?"));
			cliente.setId(Magic.i("Codigo"));
			cliente.setCnpj(Magic.s("CNPJ"));
			cliente.setContato(Magic.s("Contato"));
			System.out.println(cliente.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
