package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Heroi j1 = new Heroi();
		Monstro j2 = new Monstro();
		
		j1.nomear("Samuel");
		j2.nomear("Demon");
		
		j1.andar(Direcao.Leste);
		
		System.out.println(j1.getPosition());
		System.out.println(j2.getPosition());

		j1.atacar(j2);
		
		System.out.println(j1.getVida(j1));
		System.out.println(j2.getVida(j2));
	}

}
