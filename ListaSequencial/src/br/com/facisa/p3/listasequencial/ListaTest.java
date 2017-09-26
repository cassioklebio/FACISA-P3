package br.com.facisa.p3.listasequencial;




import java.io.InvalidObjectException;

import org.junit.Assert;
import org.junit.Test;

public class ListaTest {

	@Test
	public void inserir1() {
		Lista<Aluno> ls = new Lista<>();
		ls.inserir(new Aluno());
		ls.inserir(new Aluno());
		ls.inserir(new Aluno());
		Assert.assertEquals(3, ls.tamanho());
		}
	public void inserir2()  {
		Lista<Aluno> ls = new Lista<>();
		ls.inserirPorPosicao(2);
		Assert.assertEquals(2,2);
		
	}
	public void exclir1() throws InvalidObjectException{
		Lista<Aluno> ls = new Lista<>();
		ls.inserir(new Aluno(1));
		ls.inserir(new Aluno(2));
		ls.inserir(new Aluno(3));
		Aluno a = new Aluno(4);
		ls.inserir(a);
		ls.excluir(a);

		Assert.assertEquals(4, ls.tamanho());
		
		
	}
	public void isEmpty() {
		Lista<Aluno> ls =new Lista<>();
		ls.inserir(new Aluno());
		Assert.assertFalse(ls.isEmpty());
		
	}
	
	
	}


