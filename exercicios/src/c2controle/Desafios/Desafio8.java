package c2controle.Desafios;

import java.util.Scanner;

public class Desafio8 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine().replace(" ", "");
		
		int letras = palavra.length();
		for (int letraatual = 0; letraatual < letras;letraatual++) {
			System.out.printf("%s-", palavra.charAt(letraatual));
		}
		
		scanner.close();
	}

}
