package c1fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double valor1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double valor2 = entrada.nextDouble();
		
		System.out.println("Digite a operação: ");
		String op = entrada.next();
		
		double res = op.equals("+")? valor1 + valor2: 0;
		res = op.equals("-")? valor1 - valor2: res;
		res = op.equals("*")? valor1 * valor2: res;
		res = op.equals("/")? valor1 / valor2: res;
		res = op.equals("%")? valor1 % valor2: res;
		
		System.out.printf("%.2f %s %.2f = %.2f", valor1, op, valor2, res);
		
		entrada.close();
		
	}

}
