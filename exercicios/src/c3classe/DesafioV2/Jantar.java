package c3classe.DesafioV2;

public class Jantar {
	
	public static void main(String[] args) {
	
		Pessoa p1 = new Pessoa("Samuel", 56);
	
		Comida c1 = new Comida("Tapioca", 1);
		
		System.out.println(p1.apresentar());
		
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
	
	}
}
