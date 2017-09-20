package br.com.facisa.lista;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ListaTest {

	@Test
	public void inserir() {
		Lista <Aluno> list = new Lista<>();
		list.inserir(new Aluno());
		Assert.assertEquals(1,list.tamanho());
	}
	

}
