package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		Somar somar = new Somar();
		
		System.out.println(somar.executar(3, 7));
		
		Calculo multiplicar = new Multiplicar();
		
		System.out.println(multiplicar.executar(3,  7));
		
		multiplicar = new Somar();
		
	}

}
