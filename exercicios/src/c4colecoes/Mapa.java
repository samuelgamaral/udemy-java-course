package c4colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer , String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Samuel");
		usuarios.put(2, "Ricardo");
		
		System.out.println(usuarios.keySet());
		System.out.println();
		System.out.println(usuarios.values());
		System.out.println();
		System.out.println(usuarios.entrySet());
		System.out.println();
		System.out.println(usuarios.get(2));
		System.out.println();
		
		for(Entry<Integer, String> i: usuarios.entrySet()) {
			System.out.println(i);
		}	
	}
}
