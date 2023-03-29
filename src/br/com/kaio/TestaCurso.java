package br.com.kaio;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Relacionamento com colecoes", "Kaio Valls");
		
		List<Aula> aulas = javaColecoes.getAulas();
				
		javaColecoes.getAulas().add(new Aula("Revisando ArrayLists", 21));
		
		javaColecoes.adiciona(new Aula("Lista de Objetos", 20));
		
		System.out.println(javaColecoes.getAulas());
		
	}

}
