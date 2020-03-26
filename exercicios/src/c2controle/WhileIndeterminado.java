package c2controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String sair = "";
		
		while(!sair.equals("sair")) {
			System.out.println("Digite algo: ");
			sair = entrada.nextLine();
		}
		entrada.close();
	}

}
