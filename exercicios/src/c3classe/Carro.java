package c3classe;

public class Carro {
	
	double preco;
	String cor;
	int ano;
	String nome;
	double primeiraparcela;
	double segundaparcela;
	
	//Construtor!
	Carro(String nome1, double preco1, int ano1, String cor1) {
		nome = nome1;
		preco = preco1;
		ano = ano1;
		cor = cor1;
	}
	
	//Soma das parcelas!
	double total(double a, double b) {
		return a + b;
	}
	

}
