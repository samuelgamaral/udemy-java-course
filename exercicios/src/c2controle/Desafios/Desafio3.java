package c2controle.Desafios;

import java.util.Scanner;

public class Desafio3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1� Nota: ");
		double nota1 = entrada.nextDouble();
		
		System.out.println("2� Nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media < 7 && media > 4) {
			System.out.println("Recupera��o!");
		} else {
			System.out.println("Reprovado!");
		}
		entrada.close();
	}

}
