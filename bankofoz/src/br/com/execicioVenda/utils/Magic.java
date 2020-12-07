package br.com.execicioVenda.utils;

import javax.swing.JOptionPane;

public class Magic {
	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static Integer i(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}	
	
	public static Float f(String msg) {
		return Float.parseFloat(JOptionPane.showInputDialog(msg));
	}	
	
	public static boolean b(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Titulo", JOptionPane.YES_NO_OPTION)==0) {
			return true;
		}
		return false;
	}	
}
