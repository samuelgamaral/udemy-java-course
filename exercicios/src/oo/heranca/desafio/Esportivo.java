package oo.heranca.desafio;

public interface Esportivo {

	void LigarTurbo();
	void DesligarTurbo();
	
	void LigarAr();
	void DesligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}
	
}
