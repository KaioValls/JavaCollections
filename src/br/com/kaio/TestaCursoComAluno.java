package br.com.kaio;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Relacionamento com colecoes", "Kaio Valls");
		javaColecoes.adiciona(new Aula("Lista de Objetos", 20));
		javaColecoes.adiciona(new Aula("Lista de Objetos", 20));
		javaColecoes.adiciona(new Aula("Lista de Objetos", 20));
		
		Aluno a1 = new Aluno("Kaio Valls", 99999);
		Aluno a2 = new Aluno("Guilherme Silveira", 12345);
		Aluno a3= new Aluno("Mauricio Aniche", 12133);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		javaColecoes.getAlunos().forEach(alunos -> {
			System.out.println(alunos);
		});
		
		
		System.out.println("TODOS ALUNOS MATRICULADOS");
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		System.out.println();
		System.out.println("Aluno "+a1+" está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		System.out.println();
		System.out.println("Segundo caso");//sobrescrevendo o equals e Hashcode
		Aluno kaio = new Aluno("Kaio Valls", 99999);
		System.out.println(javaColecoes.estaMatriculado(kaio));
		
		System.out.println();
		System.out.println("Ultimo caso");//hashcode 
		System.out.println(a1.hashCode() == kaio.hashCode());
	}
}
