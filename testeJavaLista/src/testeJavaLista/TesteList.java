package testeJavaLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		
		lista.add("ANALISTA");
		lista.add("ESTAGIARIO");
		lista.add("DBA JR");
		lista.add("DBA SR");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println(lista.get(0));
		lista.remove(2);
		System.out.println(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		
		
		
		
		
		
		
	}

}
