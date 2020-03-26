package c4arrays.Exercicios;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Quantas notas você deseja adicionar? ");
//		double quantidadeDeNotas = entrada.nextDouble();
//		
//		double somaTotal = 0;
//		
//		for (int i = 1; i < quantidadeDeNotas + 1; i++) {
//			
//			System.out.printf("Digite a %dº nota: \n", i);
//			double notaAtual = entrada.nextDouble();
//			somaTotal += notaAtual;
//		}
//		
//		double media = somaTotal / quantidadeDeNotas;
//		
//		System.out.printf("A média do aluno é %.2f.", media);
//		
//		entrada.close();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas você deseja adicionar? ");
		int quantidadeDeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeDeNotas];
		
		for (int i = 0; i < quantidadeDeNotas; i++) {
			
			System.out.printf("Digite a %dº nota: \n", i + 1);
			notas[i] = entrada.nextDouble();
			
		}
		
		double total = 0;
		
		for( double nota : notas ) {
			total += nota;
		}
		
		double media = total / quantidadeDeNotas;
		
		System.out.printf("A média do aluno é %.2f.", media);
		
		entrada.close();
		
	}

}
