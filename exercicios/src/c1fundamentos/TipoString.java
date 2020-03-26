package c1fundamentos;

public class TipoString 
{
	public static void main(String[] args) 
	{
		String y = "Olá Samuel";
		System.out.println(y.length());
		System.out.println(y.startsWith("Olá"));
		System.out.println(y.endsWith("samuel"));
		
		var nome = "Samuel";
		var sobrenome = "Richardson";
		var idade = 18;
		var salario = 0.0000;
		System.out.printf("O Aluno %s %s tem %d e ganha R$%.2f.\n", nome, sobrenome, idade, salario);
		var frase = String.format("O Aluno %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
	}
}
