package br.com.kaio;

import java.util.Objects;

public class Aluno {

	private String nome;
	private int numeroRM;

	public Aluno(String nome, int numeroRM) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nome = nome;
		this.numeroRM = numeroRM;
	}

	
	public String getNome() {
		return nome;
	}

	public int getNumeroRM() {
		return numeroRM;
	}
	
	@Override
	public String toString() {
		
		return "[Aluno: "+this.nome +", RM: "+this.numeroRM+"]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroRM);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && numeroRM == other.numeroRM;
	}
	
	
}
