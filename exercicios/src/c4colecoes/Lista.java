package c4colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> Usuarios = new ArrayList<>();
		
		Usuarios.add(new Usuario("Samuel"));
		Usuarios.add(new Usuario("Ruth"));
		Usuarios.add(new Usuario("Ricardo"));
		Usuarios.add(new Usuario("Kelly"));

		System.out.println(Usuarios.get(1));
		System.out.println(Usuarios.get(3));
		
		System.out.println(Usuarios.contains(new Usuario("Ricardo")));
		System.out.println(Usuarios.contains(new Usuario("Ruth")));
	}

}
