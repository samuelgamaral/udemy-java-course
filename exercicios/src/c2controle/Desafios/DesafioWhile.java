package c2controle.Desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double quantidade = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Digite \"-1\" para sair!\nInforme a nota: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
			
				quantidade++;
				total = total + nota;
			} else if(nota != -1) {
				System.out.println("Nota inválida");
			}
		}
		
		double media = total / quantidade;
		System.out.printf("A média é %.2f.", media);
		
		entrada.close();

	}

}
