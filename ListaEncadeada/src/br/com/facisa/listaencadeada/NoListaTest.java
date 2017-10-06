package br.com.facisa.listaencadeada;






import static org.junit.Assert.*;

import org.junit.Test;

public class NoListaTest {

	@Test
	public void inseriIncioTest() {
		NoLista lista = new NoLista();
		lista.inserirNoInicio(1);
		assertEquals(1,1);
	}

	

}
