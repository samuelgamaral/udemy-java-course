package c1fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String a = new String("2");
		
		//ERRADO
		System.out.println("2" == a);
		
		//CERTO
		System.out.println("2".equals(a));
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número 2!");
		String resultado = entrada.nextLine();
		System.out.println("2".equals(resultado.trim()));
		
		entrada.close();
	}
}
