package c2controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Digite uma nota válida!");
		} else if(nota >= 8){
			System.out.println("Conceito A.");
		} else if(nota >= 6) {
			System.out.println("Conceito B.");
		} else if(nota >= 4) {
			System.out.println("Conceito C.");
		} else if(nota >= 2) {
			System.out.println("Conceito D.");
		} else if(nota >= 0) {
			System.out.println("Conceito E.");
		}
		
		entrada.close();
		
//		int x = 7;
//		
//		if(x >= 7) {
//			System.out.println("Parabéns!");
//		} else if(x >= 3 && x <= 6) {
//			System.out.println("Tente outra vez!");
//		} else if(x < 3) {
//			System.out.println("Preste mais atenção!");
//		}
		
		
		}
	}

