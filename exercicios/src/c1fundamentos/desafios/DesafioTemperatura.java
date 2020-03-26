package c1fundamentos.desafios;

public class DesafioTemperatura 
{
	public static void main(String[] args) 
	{
		// (ºF - 32) X 5/9 = ºC
		double v1 = 130;
		final double c1 = 32;
		final double c2 = 5.0/9.0;
		double resultado = (v1 - c1) *c2;
		System.out.println("Temperatura: " + resultado + "ºC.");
	}
}
