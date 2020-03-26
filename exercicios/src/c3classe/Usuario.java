package c3classe;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object teste) {
		
		Usuario testeConvertido = (Usuario) teste;
		boolean nomeIgual = testeConvertido.nome.equals(this.nome);
		
		return nomeIgual;
	}

}
