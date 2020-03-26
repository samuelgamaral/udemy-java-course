package oo.Polimorfismo;

public class Pessoa {
	
	public double peso;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comer(Comida comida) {
	 this.peso += comida.getPeso();
	}
	
}
