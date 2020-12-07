package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Aluno;

public class ImplementarAluno2 {

	public static void main(String[] args) {
		Aluno obj_aluno = new Aluno();		
		obj_aluno.setAll(
				Integer.parseInt(JOptionPane.showInputDialog("RM")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("CPF"));
		
		System.out.println(obj_aluno.getAll());
		
		
	}

}
