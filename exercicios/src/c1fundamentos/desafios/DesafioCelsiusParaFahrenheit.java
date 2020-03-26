package c1fundamentos.desafios;

import java.util.Scanner;

public class DesafioCelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double temp = entrada.nextDouble();
		
		double res = (temp * 9/5) + 32;
		
		System.out.printf("A temperatura em Fahrenheit é %.2f.", res);
		
		entrada.close();
		
	}
}
