package oo.composicao;

public class Carro {
		
	Motor m1;
	
	Carro() {
		this.m1 = new Motor(this);
	}
	void ligarDesligar() {
		if(m1.ativo == false) {
			m1.ativo = true;
		} else 
			m1.ativo = false;
	}
	
	void acelerar() {
		if(m1.ativo == true) {
			m1.fatorDeInjecao += 0.4;
		}
	}
	
	void frear() {
		if(m1.ativo == true) {
			m1.fatorDeInjecao -= 0.4;
		}
	}
	
	boolean estaLigado() {
		return m1.ativo;
	}
}
