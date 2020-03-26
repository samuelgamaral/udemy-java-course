package c3classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Samuel";
		u1.email = "samuelgamaral@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Samuel";
		u2.email = "samuelgamaral@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}

}
