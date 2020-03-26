package c3classe.Desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	void comer(Comida comida) {
		peso += comida.kcal;
	}

}
