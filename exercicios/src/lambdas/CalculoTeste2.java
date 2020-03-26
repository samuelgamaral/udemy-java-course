package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calcular = (x, y) -> {return x + y ;};
		
		System.out.println(calcular.executar(18, 23));
		
		calcular = (x, y) -> {return x * y ;};
		
		System.out.println(calcular.executar(18, 23));
		
		System.out.println(calcular.executar(18, 23));
	}
	
}
