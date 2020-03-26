package c1fundamentos;

public class NotacaoPonto 
{
	public static void main(String[] args) 
	{
		//Várias funções com o "."!
		String x = "Notação Ponto é A";
		x = x.replace("A", "Importante!").toUpperCase().concat(" º.º");
		System.out.println(x);
		//Não funciona com tipos Primitivos!!
		
	}
}
