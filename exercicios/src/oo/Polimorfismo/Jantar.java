package oo.Polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida arroz = new Arroz();
		Comida feijao = new Feijao();
		
		arroz.setPeso(0.15);
		feijao.setPeso(0.1);
		
		Pessoa Samuel = new Pessoa();
		
		Samuel.setPeso(57.5);
		
		Samuel.comer(arroz);
		
		System.out.println(Samuel.getPeso());
		
		Samuel.comer(feijao);
		
		System.out.println(Samuel.getPeso());
		
	}

}
