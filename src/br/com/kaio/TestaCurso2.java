package br.com.kaio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Relacionamento com colecoes", "Kaio Valls");
		javaColecoes.adiciona(new Aula("Revisando ArrayLists", 21));
		javaColecoes.adiciona(new Aula("Lista de Objetos", 20));
		
		List<Aula> aulas = new ArrayList<>(javaColecoes.getAulas()); 
		
		

		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println(aulas);
				

		
		
		
	}

}
