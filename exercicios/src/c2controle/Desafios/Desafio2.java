package c2controle.Desafios;

import java.util.Scanner;

public class Desafio2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 || ano % 400 == 0) {
			System.out.println("Ano Bissexto!");
		} else {
			System.out.println("Ano N�O Bissexto!");
		}
		
		entrada.close();
	}

}
