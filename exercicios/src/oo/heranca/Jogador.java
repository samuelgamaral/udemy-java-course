package oo.heranca;

public class Jogador {
	
	String nome;
	int vida = 100;
	int x = 0;
	int y = 0;
	
	public void nomear(String nome) {
		this.nome = nome;
	}
	
	public String getPosition() {
		String position = "["+this.x+","+this.y+"]";
		return position;
	}
	
	public String getVida(Jogador jogador) {
		String vida = jogador.nome + " possui " + jogador.vida + " de vida.";
		
		return vida;
	}

	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case Norte:
			y++;
			break;
		case Leste:
			x++;
			break;
		case Sul:
			y--;
			break;
		case Oeste:
			x--;
			break;
		}
		
		return false;
	}
	
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);
		
		if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
			
	}
	
}
