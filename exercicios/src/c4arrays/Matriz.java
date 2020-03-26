package c4arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdeAlunos = 0;
		
		System.out.println("Quantos alunos? ");
		qtdeAlunos = entrada.nextInt();
		
		int notasporAluno = 0;
		
		System.out.println("Notas por aluno? ");
		notasporAluno = entrada.nextInt();
		
		double[][] notasdaTurma = new double[qtdeAlunos][notasporAluno];
		
		int totaldeNotas = 0;
		
		for (int a = 0; a < qtdeAlunos ; a++) {
			for (int n = 0; n < notasporAluno ; n++) {
					
				System.out.printf("Digite a %d nota do aluno %d:  ", n + 1, a + 1);
				notasdaTurma[a][n] = entrada.nextDouble();
				totaldeNotas += notasdaTurma[a][n];
				
			}
		}
		
		double media = totaldeNotas / (qtdeAlunos * notasporAluno);
		
		System.out.printf("A média da sala foi %.2f.\n", media);
		
		for( double[] notas : notasdaTurma ) {
			
			System.out.println(Arrays.toString(notas));
			
		}
		
		entrada.close();
		
	}

}
