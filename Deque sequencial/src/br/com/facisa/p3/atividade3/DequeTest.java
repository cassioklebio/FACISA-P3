package br.com.facisa.p3.atividade3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class DequeTest {

	@Test
	public void InserirInicioTest() {
		Deque deque = new Deque();
		deque.inserirInicio(1);
		deque.inserirInicio(2);
		deque.inserirInicio(3);
		Assert.assertEquals(3, deque.tamanho());
		}
	
	public void InserirFim() {
		Deque deque = new Deque();
		deque.inserirFim(5);
		deque.inserirFim(6);
		deque.inserirFim(7);
		Assert.assertEquals(3, deque.tamanho());
	}
	public void excluirInicioTest() {
		Deque deque = new Deque();
		deque.inserirInicio(1);
		deque.inserirInicio(2);
		deque.removerInicio(1);
		Assert.assertEquals(3,deque.tamanho());
		
		
	}
	public void excluirFimTest() {
		Deque deque = new Deque();
		deque.inserirFim(1);
		deque.inserirFim(2);
		deque.removerFim(1);
		Assert.assertEquals(3, deque.tamanho());
	}
	
	
}
