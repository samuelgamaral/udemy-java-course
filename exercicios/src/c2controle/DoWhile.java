package c2controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String sair = "";
		
		do {
			
			System.out.println("Digite a palavra certa: ");
			sair = entrada.nextLine();
			
		} while(!sair.equals("sair"));
		
		System.out.println("Ok!");
		
		entrada.close();
	}

}
