package c3classe;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	double num;
	
	double precoComDesconto() {
		return (1 - desconto) * preco;
	}

}
