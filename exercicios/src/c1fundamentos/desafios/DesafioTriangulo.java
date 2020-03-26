package c1fundamentos.desafios;

import java.util.Scanner;

public class DesafioTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double alt = entrada.nextDouble();
		
		double res = base * alt / 2;
		
		System.out.printf("A área do tringulo é %.2f.", res);
		
		entrada.close();
		
	}
}
