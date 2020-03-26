package oo.composicao;

public class Motor {
	
	Carro c1;
	
	Motor (Carro c1) {
		this.c1 = c1;
	}
	
	double fatorDeInjecao = 1;
	boolean ativo = false;
	
	int Giros() {
		if(ativo == true) {
		return (int)Math.round((fatorDeInjecao * 3000));
		} else {
			return 0;
		}
	}
	
}
