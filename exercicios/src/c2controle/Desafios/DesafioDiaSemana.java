package c2controle.Desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String dia = entrada.nextLine().toLowerCase().replace("�", "c").replace("�", "a");
		
		if(dia .equals("Domingo")) {
			System.out.println("O dia corresponde ao 1� da semana.");
		} else if(dia .equals("segunda")) {
			System.out.println("O dia corresponde ao 2� da semana.");
		} else if(dia .equals("terca")) {
			System.out.println("O dia corresponde ao 3� da semana.");
		} else if(dia .equals("quarta")) {
			System.out.println("O dia corresponde ao 4� da semana.");
		} else if(dia .equals("quinta")) {
			System.out.println("O dia corresponde ao 5� da semana.");
		} else if(dia .equals("sexta")) {
			System.out.println("O dia corresponde ao 6� da semana.");
		} else if(dia .equals("sabado")) {
			System.out.println("O dia corresponde ao 7� da semana.");
		} else {
			System.out.println("Dia inv�lido!");
		}
		
		entrada.close();
	}

}
