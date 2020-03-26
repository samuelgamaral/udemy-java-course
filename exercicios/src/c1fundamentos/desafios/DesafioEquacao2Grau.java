package c1fundamentos.desafios;

import java.util.Scanner;

public class DesafioEquacao2Grau {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de 'a': ");
		double a = entrada.nextDouble();
		
		System.out.println("Digite o valor de 'b': ");
		double b = entrada.nextDouble();
		
		System.out.println("Digite o valor de 'c': ");
		double c = entrada.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		System.out.println(delta);
		
		double raiz1 = (-b + Math.sqrt(delta))/ 2 * a;
		double raiz2 = (-b - Math.sqrt(delta))/ 2 * a;
		
		System.out.printf("As raizes da equação são respectivamento: %.2f, %.2f", raiz1, raiz2);
		
		entrada.close();
		
	}

}
