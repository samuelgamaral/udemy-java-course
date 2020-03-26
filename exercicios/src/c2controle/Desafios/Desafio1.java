package c2controle.Desafios;

import java.util.Scanner;

public class Desafio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num = 0;
		
		System.out.println("Digite um número: ");
		num = entrada.nextDouble();
		
		if (num >= 10 || num <= 0) {
			System.out.println("Este número NÃO está no intervalo entre 0 e 10!");
		} else {
			System.out.println("Este número pertence ao intervalo entre 0 e 10!");
		}
		
		entrada.close();
	}

}
