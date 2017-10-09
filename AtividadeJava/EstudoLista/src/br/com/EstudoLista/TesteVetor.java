package br.com.EstudoLista;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteVetor {

	@Test
	public void test() {
		
			Aluno a1 = new Aluno();
		    Aluno a2 = new Aluno();

		    a1.setNome("João");
		    a2.setNome("José");

		    Vetor lista = new Vetor();

		    lista.adiciona(a1);
		    lista.adiciona(a2);

		    System.out.println(lista);

		
	}
}
