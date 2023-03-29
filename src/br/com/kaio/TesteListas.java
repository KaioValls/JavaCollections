package br.com.kaio;

import java.util.ArrayList;
import java.util.Collections;

public class TesteListas {

	public static void main(String[] args) {
		String aula1 ="Conhecendo mais de listas" ;
		String aula2 ="Modelando a classe Aula" ;
		String aula3 ="Trabalhando com Cursos e Sets" ;
		//cria o Array
		ArrayList<String> aulas = new ArrayList<>();
		//Adiciona objetos no array
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		System.out.println(aulas);
		
		//remove objetos
		aulas.remove(0);
		System.out.println(aulas);
		
		//for para percorrer o array
		for (String aula : aulas) {
			System.out.println("Aula: "+aula);
		}
		
		//pegar um objeto passando o indice
		String primeiraAula = aulas.get(0);
		System.out.println("Pegamos a primeira aula: "+ primeiraAula);
		
		//outro for para percorrer o array
		for (int i = 0; i < aulas.size() ; i++) {
			System.out.println(aulas.get(i));
		}
		
		//Foreach com lambda ***melhor método***
		aulas.forEach( aula  -> {
			System.out.println(aula);
			System.out.println("legal")
			;});
		
//		organizando com o Collections que por padrão para string organiza
//		de forma alfabética
		System.out.println("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);//usamos muito
		System.out.println(aulas);
		
		aulas.sort(null);//nesse caso temos que passar um comparator
		
	}

}
