package c2controle.Desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana: ");
		String dia = entrada.nextLine().toLowerCase().replace("ç", "c").replace("á", "a");
		
		if(dia .equals("Domingo")) {
			System.out.println("O dia corresponde ao 1º da semana.");
		} else if(dia .equals("segunda")) {
			System.out.println("O dia corresponde ao 2º da semana.");
		} else if(dia .equals("terca")) {
			System.out.println("O dia corresponde ao 3º da semana.");
		} else if(dia .equals("quarta")) {
			System.out.println("O dia corresponde ao 4º da semana.");
		} else if(dia .equals("quinta")) {
			System.out.println("O dia corresponde ao 5º da semana.");
		} else if(dia .equals("sexta")) {
			System.out.println("O dia corresponde ao 6º da semana.");
		} else if(dia .equals("sabado")) {
			System.out.println("O dia corresponde ao 7º da semana.");
		} else {
			System.out.println("Dia inválido!");
		}
		
		entrada.close();
	}

}
