package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{
	
	private boolean LigarTurbo;
	private boolean LigarAr;
	
	@Override
	public void LigarTurbo() {
		LigarTurbo = true;
	}
	
	@Override
	public void DesligarTurbo() {
		LigarTurbo = false;
	}
	
	@Override
	public void LigarAr() {
		LigarAr = true;
	}
	
	public void DesligarAr() {
		LigarAr = false;
	}
	
	public int getDelta() {
		if(LigarTurbo && !LigarAr) {
			return 35;
		} else if(LigarTurbo && LigarAr) {
			return 30;
		} else if(!LigarTurbo && LigarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
	public void Acelerar() {
		this.veloAtual += super.getDelta();
	}
}
