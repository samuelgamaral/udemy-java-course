package c1fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
	
		double media = 6.0;
		
		String reprovado = media <4.0 ? "reprovado" : "em recupera��o";
		String resultado = media >=7.0 ? "aprovado" : reprovado;
		System.out.printf("O aluno est� %s.", resultado);
	}
}
