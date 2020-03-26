package c2controle;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String faixa = "";
		
		System.out.println("Qual a sua faixa? ");
		faixa = entrada.next();
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Avançado");
		case "branca":
			System.out.println("Iniciante");
			
		}
		
		entrada.close();
	}

}
