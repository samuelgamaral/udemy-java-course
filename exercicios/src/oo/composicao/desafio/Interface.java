package oo.composicao.desafio;

public class Interface {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Mouse", 34.90);
		Produto p2 = new Produto("Teclado", 45.00);
		Produto p3 = new Produto("Fone de ouvido", 12.99);
		
		Compra c1 = new Compra();
		c1.adicionarItem(p1, 2);
		c1.adicionarItem(p2, 1);
		c1.adicionarItem(p3, 3);
		
		Cliente cl1 = new Cliente("Samuel");
			
		System.out.printf("%s gastou %.2f no site.", cl1.nome, c1.obterValorTotal());
	}

}
