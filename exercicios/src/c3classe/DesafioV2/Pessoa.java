package c3classe.DesafioV2;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		peso += comida.peso;
	}
	
	String apresentar() {
		return "Oi, meu nome é " + nome + " e meu peso é " + peso + ".";	
	}

}
