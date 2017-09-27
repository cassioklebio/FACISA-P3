package br.com.EstudoLista;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteLista {

	@Test
	public void test() {
		
			Aluno a1 = new Aluno();
		    Aluno a2 = new Aluno();

		    a1.setNome("João");
		    a2.setNome("José");

		    Lista lista = new Lista();

		    lista.adiciona(a1);
		    lista.adiciona(a2);

		    System.out.println(lista);

		
	}
}
