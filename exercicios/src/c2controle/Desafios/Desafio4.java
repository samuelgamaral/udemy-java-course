package c2controle.Desafios;

import java.util.Scanner;

public class Desafio4 { 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		
		System.out.print("Informe um numero: ");
		
		int valor = entrada.nextInt();
		
		
		for (int i = 2; i < valor; i++) {
			
			if (valor % i == 0) {
				contador++;
			}
			
		}
		
		if (contador == 0) {
			System.out.println("Este � um n�mero primo!");
		} else {
			System.out.println("Este N�O � um n�mero primo!");
		}
		
		entrada.close();
		
	}

}
