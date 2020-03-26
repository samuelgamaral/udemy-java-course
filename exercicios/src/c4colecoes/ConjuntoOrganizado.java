package c4colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoOrganizado {
	
	public static void main(String[] args) {
		
		HashSet<String> lista = new HashSet<String>();
		lista.add("Aprendendo Java");
		lista.add("Samuel");
		lista.add("Richardson");
		
		//System.out.println(lista);
		
		for(String elementos: lista) { // Fora de ordem.
			System.out.println(elementos);
		}
		
		Set<String> listaOrdenada = new TreeSet<String>(); //TreeSet ordena a lista!
		listaOrdenada.add("Aprendendo Java");
		listaOrdenada.add("Samuel");
		listaOrdenada.add("Richardson");
		
		
	}
	
}
