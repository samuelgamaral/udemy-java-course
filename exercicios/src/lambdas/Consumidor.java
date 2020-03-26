package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = prod -> System.out.println(prod.nome);
		
		Produto p1 = new Produto("Mouse", 57.99, 0.15);
		
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Mouse", 57.99, 0.15);
		Produto p3 = new Produto("Mouse", 57.99, 0.15);
		Produto p4 = new Produto("Mouse", 57.99, 0.15);
		
		List<Produto> produtos = Arrays.asList(p2, p3, p4);
		
		produtos.forEach(imprimirNome);
		
	}

}
