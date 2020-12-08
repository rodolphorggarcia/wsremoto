package testeJavaLista;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		
		lista.add("DBA");
		lista.add("ANALISTA");
		lista.add("PMO");
		lista.add("DEV");
		lista.add("DBA");

		
		
		System.out.println(lista);
		
		//foreach => quando voce nao quer ou nao pode utilizar o indice
		
		for (String cargo : lista) {
			System.out.println(cargo);
		}
		
		
		
	}

}
