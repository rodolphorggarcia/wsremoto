package testeJavaLista;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();
		
		lista.put(1, new Cargo("DEV", "JR", 5000));
		lista.put(2, new Cargo("DEV", "PL", 6000));
		lista.put(3, new Cargo("DEV", "SR", 7000));
		
		System.out.println(lista);
		System.out.println(lista.get(1));
		System.out.println(lista.values());
		
		for (Cargo objeto : lista.values()) {
			System.out.println(objeto.getNome());
			System.out.println(objeto.getNivel());
			System.out.println(objeto.getSalario());
		}

	}

}
