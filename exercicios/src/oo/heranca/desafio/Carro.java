package oo.heranca.desafio;

public class Carro {
	
	int veloAtual = 0;
	int velocidadeMaxima ;
	private int delta= 5;
	int deltaFreio = 5;
	
	
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	Carro() {
		
	}
	
	public Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public String getVeloAtual() {
		String velo = veloAtual + "km/h.";
		return velo;
	}
	
	public void Acelerar() {
		if(veloAtual + delta > velocidadeMaxima) {
			veloAtual = velocidadeMaxima;
		} else {
			this.veloAtual += this.delta;
		}
	}
	
	public boolean Frear() {
		if(this.veloAtual > 0) {
			this.veloAtual -= deltaFreio;
			return true;
		} else {
			return false;
		}
	}

}
