package c1fundamentos.desafios;

import java.util.Scanner;

public class DesafioExpoente {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num = entrada.nextDouble();
		
		double numcalao2 = Math.pow(num, 2);
		double numcalao3 = Math.pow(num, 3);
		
		System.out.printf("O quadrado do número é %.2f e o cubo é %.2f.", numcalao2, numcalao3);
		
		entrada.close();
	}
}
