package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class ImplementarAluno {

	public static void main(String[] args) {
		
		Aluno obj_aluno = new Aluno();
		obj_aluno.setCpf(JOptionPane.showInputDialog("CPF"));
		obj_aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		obj_aluno.setRm(Integer.parseInt(JOptionPane.showInputDialog("RM")));
		System.out.println("Nome: " + obj_aluno.getNome());
		System.out.println("CPF: " + obj_aluno.getCpf());
		System.out.println("RM: " + obj_aluno.getRm());
		System.out.println(obj_aluno.getAll());

	}

}