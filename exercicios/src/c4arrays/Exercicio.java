package c4arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 7.4;
		notasAlunoA[2] = 9.6;
		notasAlunoA[3] = 9.6;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double somaDasNotasA = 0;
		double quantidadeDeNotasA = notasAlunoA.length;
		for(int i = 0; i < quantidadeDeNotasA; i++) {
			somaDasNotasA += notasAlunoA[i];
		}
		System.out.println(somaDasNotasA / quantidadeDeNotasA);
		
		//OU...
		
		double[] notasAlunoB = { 8.7, 7.5, 7.2, 9.3 };
		
		double quantidadeDeNotasB = notasAlunoB.length;
		double somaDasNotasB = 0;
		
		for(int i = 0; i < quantidadeDeNotasB; i++) {
			somaDasNotasB += notasAlunoB[i];
		}
		
		System.out.println(somaDasNotasB / quantidadeDeNotasB);
	}

}
