package br.com.kaio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisando ArrayLists", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3= new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println();
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
//		fazem a mesma coisa, porém o de baixo é mais legivel e melhor para leitura
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println();
		System.out.println(aulas);
		
	}

}
