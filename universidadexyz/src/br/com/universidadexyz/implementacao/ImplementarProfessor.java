package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		
		
		Professor p = new Professor();
		Endereco e = new Endereco();
		
		p.setApelido("Red");
		p.setId(806);
		p.setFormacao("Engenheiro");
		p.setValorHora(10);
		
		
		p.setEndereco(e);
		e.setLogadouro("Rua xxxx");
		e.setNumero("171");
		e.setUf("SP");
		e.setCep("13806373");
		e.setBairro("Muruayama");
		
		
		System.out.println(p.getApelido());
		System.out.println(p.getEndereco().getNumero());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
