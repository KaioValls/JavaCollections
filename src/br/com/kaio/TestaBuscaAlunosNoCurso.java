package br.com.kaio;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestaBuscaAlunosNoCurso {

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
		
		System.out.println("O Aluno 99999 está ai? ");
		Aluno aluno = javaColecoes.buscaMatriculado(99999);
		System.out.println(aluno);
		
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
	     nomesParaIdade.put("Paulo", 31);
	     nomesParaIdade.put("Adriano", 25);
	     nomesParaIdade.put("Alberto", 33);
	     nomesParaIdade.put("Guilherme", 26);
	     
		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
		for (Entry<String, Integer> associacao : associacoes) {
		    System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
	}

}
