package variaveis;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		
		

		String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
		double notaPrimeiro = Double.parseDouble(JOptionPane.showInputDialog("Entre com o nota do primeiro semestre: "));
		double notaSegundo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o nota do segundo semestre: "));
		
		System.out.println("Nome: "+ disciplina);
		System.out.println("Nota primeiro semestre: "+notaPrimeiro);
		System.out.println("Nota segundo semestre: " +notaSegundo);
		System.out.println("Media: "+(notaPrimeiro + notaSegundo)/2 + " %");
		
		
		
		/*
		 * Regras para identificadores(nome):
		 * Nao comecar com numeros
		 * Nao utilizar palavras reservadas: ex: double
		 * Nao usar caracteres especiais
		 * 
		 * */
		
		/*
		 * Padroes:
		 * CamelCase - cada palavra em um nome dese ser iniciado com letra maiuscula
		 * Exemplos: Classe: PesspaFisica, Variavel: dataDeNascimento
		 * 
		 * Nomes significativos, Evite: x, y, z, alpha, etc...
		 * 
		 * 
		 * Padrao UML (POO) 
		 * =>> Toda a classe deve iniciar com letra maiscula
		 * =>> toda variavel deve comecar com letra minuscula
		 * =>> Todo metodo pertence a uma classe e deve vir seguido de parenteses
		 * */
		
		
		

	}

}
