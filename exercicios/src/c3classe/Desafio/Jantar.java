package c3classe.Desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Samuel";
		p1.peso = 56;
		
		Comida biscoito = new Comida();
		biscoito.nome = "Biscoito";
		biscoito.kcal = 0.5;
		
		Comida arroz = new Comida();
		arroz.nome = "Arroz";
		arroz.kcal = 1;
		
		System.out.printf("O peso inicial é %.2fkg.",p1.peso);
		
		p1.comer(biscoito);
		
		System.out.printf("\nPeso atual: %.2f.", p1.peso);
		
		p1.comer(arroz);
		
		System.out.printf("\nPeso atual: %.2f.", p1.peso);
		
	}

}
