package c2controle.Desafios;

import java.util.Scanner;

public class Desafio7 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double numero = 0;
		double contador = 0;
		
		
		while (numero >= 0) {
			
			System.out.println("\nEscolha um n�mero : ");
			numero = scanner.nextDouble();
			
			if (numero >= 0) {
				contador += numero;
				System.out.printf("A soma dos n�meros � %.2f", contador);
			}
		}
		
		System.out.println("N�mero inv�lido!");
		
		scanner.close();
	
	}

}
