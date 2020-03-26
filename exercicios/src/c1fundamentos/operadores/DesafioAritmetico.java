package c1fundamentos.operadores;

public class DesafioAritmetico 
{
	public static void main(String[] args) 
	{
		var a1 = 6*(3+2);
		var a2 = Math.pow(a1, 2);
		var a3 = a2/(3*2);
		
		var b1 = (1-5)*(2-7);
		var b2 = b1/2;
		var b3 = Math.pow(b2, 2);
		
		var c1 = a3 - b3;
		var c2 = Math.pow(c1, 3);
		
		var d1 = c2/Math.pow(10, 3);
		
		System.out.println(d1);
	}
}
