package br.com.kaio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
	private String intrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
	
	public Curso(String nome, String intrutor) {
		super();
		this.nome = nome;
		this.intrutor = intrutor;
	}

	public String getIntrutor() {
		return intrutor;
	}

	public String getNome() {
		return nome;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal(){ 
		return this.aulas.stream().mapToInt(Aula::getTempo).sum(); 
		}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroRM(), aluno);
	} 
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException("Não tem");
		return matriculaParaAluno.get(numero);
	}

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
