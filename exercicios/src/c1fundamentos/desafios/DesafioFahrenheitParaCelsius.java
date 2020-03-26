package c1fundamentos.desafios;

import java.util.Scanner;

public class DesafioFahrenheitParaCelsius {
	
	public static void main(String[] args) {
		
		// f=(c*9/5)+32
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double temp = entrada.nextDouble();
		
		double res = (temp - 32) * 5/9;
		
		System.out.printf("A temperatura em Fahrenheit é %.2f.", res);
		
		entrada.close();
		
	}
}
