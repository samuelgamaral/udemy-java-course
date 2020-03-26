package c4colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> Livros = new ArrayDeque<>();
		
		Livros.add("Dom Quixote");
		Livros.add("Hobbit");
		Livros.push("O Vendedor de sonhos");
		
		System.out.println(Livros.peek());
		
		System.out.println(Livros.poll());
		System.out.println(Livros.poll());
		System.out.println(Livros.poll());
		System.out.println(Livros.poll());
	}

}
