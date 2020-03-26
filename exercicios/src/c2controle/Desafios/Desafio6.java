package c2controle.Desafios;

import java.util.Random;
import java.util.Scanner;

public class Desafio6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int continuar;
		int escolhido;
		int tentativas;
		
		do {
			
		System.out.println("Gerando um n�mero aleat�rio...");
		Random entradanum = new Random();
		int sorteado = entradanum.nextInt(101);
		tentativas = 0;
		
			do {
				tentativas = tentativas + 1;
				System.out.printf("\nFa�a sua %d� aposta: ", tentativas);
				escolhido = entrada.nextInt();
				
					if (escolhido > sorteado) {
						System.out.printf("O n�mero sorteado � menor que %d!\n", escolhido);
					} else if (escolhido < sorteado) {
						System.out.printf("O n�mero sorteado � maior que %d!\n", escolhido);
					} else if (escolhido == sorteado) {
						System.out.println("Parab�ns voc� acertou!!!\n");
					}
			} while(escolhido != sorteado && tentativas != 10);
			
			System.out.println("Digite 0 para sair, ou qualquer outro para continuar!");
			continuar = entrada.nextInt();
		
		} while(continuar != 0);
		
		entrada.close();
	}

}
