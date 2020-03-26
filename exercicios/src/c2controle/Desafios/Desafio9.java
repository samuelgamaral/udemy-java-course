package c2controle.Desafios;

import java.util.Scanner;

public class Desafio9 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contador = 0;
		int maiornumero = 0;
		
		do {
			
			System.out.print("Digite um número: ");
			int numero = entrada.nextInt();
			
			if (numero > maiornumero) {
				
				maiornumero = numero;
				
			}
			
			contador++;
			
		} while (contador != 10);
		
		System.out.printf("O maior número digitado é %d.", maiornumero);
		
		entrada.close();
		
	}
	
}
