package c1fundamentos.operadores;

public class DesafioLogico 
{
	public static void main(String[] args) 
	{
		//trabalho na ter�a( V ou F)
		//trabalho na quinta(V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		System.out.println("Vai comprar a televis�o de 50\"?" + (trabalho1 && trabalho2));
		
		System.out.println("Vai comprar a televis�o de 32\"?" + (trabalho1 ^ trabalho2));
		
		System.out.println("Vai tomar sorvete?" + (trabalho1 || trabalho2));
		boolean saudavel = trabalho1 || trabalho2;
		
		System.out.println("Vai ficar mais saud�vel?" + (!saudavel));
	}
}
