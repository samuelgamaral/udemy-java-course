package c1fundamentos;
import java.util.Scanner;
public class Console 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		var nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		var idade = entrada.nextInt();
		
		System.out.printf("Seu nome é %s e você tem %d anos.", nome, idade);
		
		entrada.close();
		
	}
}
