package c2controle.Desafios;

import java.util.Scanner;

public class Desafio7 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double numero = 0;
		double contador = 0;
		
		
		while (numero >= 0) {
			
			System.out.println("\nEscolha um número : ");
			numero = scanner.nextDouble();
			
			if (numero >= 0) {
				contador += numero;
				System.out.printf("A soma dos números é %.2f", contador);
			}
		}
		
		System.out.println("Número inválido!");
		
		scanner.close();
	
	}

}
