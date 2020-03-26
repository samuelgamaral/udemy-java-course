package c3classe;

public class CarroTeste {
	
	public static void main(String[] args) {
		
//		var c1 = new Carro();
//		
//		c1.preco = 45000;
//		c1.cor = "Preto";
//		c1.ano = 2015;
//		c1.nome = "Gol";
//		
		Carro c1 = new Carro("Gol", 45000, 2015, "Preto");
		
		double pagamentototal = c1.total(300, 1000);
		
		System.out.println(pagamentototal);
		
		System.out.printf("Nome: %s\nPreço: R$%.2f\nCor: %s\nAno: %d.", c1.nome, c1.preco, c1.cor, c1.ano);
	}

}
