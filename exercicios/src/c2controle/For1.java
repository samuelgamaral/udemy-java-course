package c2controle;

public class For1 {
	
	public static void main(String[] args) {
		
//		for(int contador = 1; contador <= 10; contador++) {
//			System.out.printf("Contador = %d.\n", contador);
//		}
		
		int x = 7;
		
		if(x >= 7) {
			System.out.println("Parabéns!");
		} else if(x >= 3 && x <= 6) {
			System.out.println("Tente outra vez!");
		} else if(x < 3) {
			System.out.println("Preste mais atenção!");
		}
		
		
	}

}
