package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Samuel";
		
		c1.itens.add(new Item("lápis", 3, 1.2));
		c1.itens.add(new Item("Caderno", 2, 12.90));
		
		System.out.printf("O valor total da sua compra é: %.2f.", c1.obterValorTotal());
		
	}

}
