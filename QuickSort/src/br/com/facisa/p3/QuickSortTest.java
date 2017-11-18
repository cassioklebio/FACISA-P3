package br.com.facisa.p3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {

	@Test
	public void test() {
		int[] vetor = {9,89,24,0,-1,-2,-3,10,12};
		QuickSort quick = new QuickSort();
		quick.quickSort(vetor, 0, vetor.length-1);
		int[] vetorordenado = {-3,-2,-1,0,9,10,12,24,89};
		Assert.assertArrayEquals(vetorordenado,vetor);
	}

}
