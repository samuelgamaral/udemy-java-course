package c1fundamentos.desafios;

import java.util.Scanner;

public class DesafioIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura em metros: ");
		double alt = entrada.nextDouble();
		
		double imc = peso /(Math.pow(alt, 2));
		
		System.out.printf("Seu IMC é %.2f.", imc);
		
		entrada.close();
	}

}
