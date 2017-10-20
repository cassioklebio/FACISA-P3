package br.com.facisa.p3.selectionSort;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void inserirTest() {
		SelectionSort sort = new SelectionSort(5);
		sort.inserir(4);
		sort.inserir(5);
		sort.inserir(6);
		sort.inserir(7);
		sort.inserir(9);
		sort.imprimir();
		sort.selectionsort();
		sort.imprimir();
		
		
		
	}

}
