package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari();
		
		ferrari.LigarTurbo();
		System.out.println("Ferrari -->  " + ferrari.getVeloAtual());
		ferrari.Acelerar();		
		System.out.println("Ferrari -->  " + ferrari.getVeloAtual());
		ferrari.DesligarTurbo();
		ferrari.Acelerar();
		System.out.println("Ferrari -->  " + ferrari.getVeloAtual());
		
		System.out.println("Civic -->  " + civic.getVeloAtual());
		
		System.out.println(ferrari.velocidadeDoAr());
		
	}

}
