package c3classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
	
		Produto p1 = new Produto();
		
		p1.nome = "Lapis";
		p1.preco = 8;
		p1.desconto = 0.12;
		
		Produto p2 = new Produto();
		p2.num = 10;
		System.out.println(p2.num);
		
		System.out.println(p1.precoComDesconto());
	}
}
