package c1fundamentos.operadores;

public class Logicos 
{
	public static void main(String[] args) 
	{
		//Operadores Lógicos "E" "OU" "XOR"
		
		boolean decisao1 = 3>7;
		boolean decisao2 = 9>2;
		
		System.out.println(decisao1 && decisao2);//E
		System.out.println(decisao1 || decisao2);//OR
		System.out.println(decisao1 ^ decisao2);//XOR
		
		System.out.println("\nOperador 'E'");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("\nOperador 'OR'");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nOperador 'XOR'");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		
	}
}
