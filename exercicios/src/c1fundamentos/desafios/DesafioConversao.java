package c1fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu salário: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu salário: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		Double media = (Double.parseDouble(salario1) + 
						Double.parseDouble(salario2) + 
						Double.parseDouble(salario3))/3;
		
		System.out.printf("A média salarial é: R$%.2f.", media);
		
		entrada.close();
	}
}
