package c2controle.Desafios;

import java.util.Scanner;

public class Desafio5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = entrada.nextInt();
		
		int contdiv = 0;
		
		for (int i = 2;i < num;i++) {
			if (num % i == 0) {
				contdiv++;
			}
		}
		
		switch (contdiv) {
		case 0: 
			System.out.println("Este � um n�mero primo!");
			break;
		 default: 
			System.out.println("Este N�O � um n�mero primo!");
		}
		
		entrada.close();
		
	}

}
