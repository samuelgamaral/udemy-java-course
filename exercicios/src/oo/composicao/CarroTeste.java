package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
	
		Carro c1 = new Carro();
		
		c1.ligarDesligar();
		System.out.println(c1.estaLigado());
		
		c1.ligarDesligar();
		System.out.println(c1.estaLigado());
		
		c1.ligarDesligar();
		System.out.println(c1.estaLigado());

		
		System.out.println(c1.m1.Giros());
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println(c1.m1.Giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println(c1.m1.Giros());
		
		c1.ligarDesligar();
		System.out.println(c1.m1.Giros());
		
	}

}
