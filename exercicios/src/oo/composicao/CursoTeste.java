package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Python");
		
		Aluno a1 = new Aluno("Samuel");
		Aluno a2 = new Aluno("Leo");
		
		c1.adicionarAluno(a1);
		a2.adicionarCurso(c2);
		a1.adicionarCurso(c2);
		c1.adicionarAluno(a2);
		
		for(Aluno aluno : c1.alunos) {
			
			System.out.printf("Olá, estou matriculado no curso %s\ne meu nome é %s.\n\n",
											c1.nome, aluno.nome);
			
		}
	}

}
