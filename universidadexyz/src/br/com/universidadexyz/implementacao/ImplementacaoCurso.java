package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Curso;

public class ImplementacaoCurso {
	
	public static void main(String[] args) {
		
		
		Curso obj_curso = new Curso();
		
		obj_curso.setAll(
				JOptionPane.showInputDialog("Descricao"),
				Float.parseFloat(JOptionPane.showInputDialog("Valor")),
				Short.parseShort(JOptionPane.showInputDialog("Carga Horaria")),
				JOptionPane.showInputDialog("Sigla"),
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				Integer.parseInt(JOptionPane.showInputDialog("Duracao")));
		
		System.out.println(obj_curso.getAll());
		System.out.println(obj_curso.getPromocao());
		System.out.println(obj_curso.getPromocao(Float.parseFloat(JOptionPane.showInputDialog("Simular valor %"))));
		obj_curso.ajustarValor(Float.parseFloat(JOptionPane.showInputDialog("Ajustar valor %")));
		System.out.println(obj_curso.getAll());	
	}
}