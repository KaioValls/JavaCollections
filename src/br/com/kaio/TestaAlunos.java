package br.com.kaio;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Kaio Valls");
		alunos.add("Joao da barra");
		alunos.add("Giovanni Giorge");
		alunos.add("Nico Steppat");
		alunos.add("Renan ");
		alunos.add("Mauricio ");
		
		System.out.println(alunos.size());
		
		
		alunos.forEach(aluno ->{
			System.out.println(aluno);
		});
		
		System.out.println(alunos.contains("Kaio Valls"));
		
		
	}

}
