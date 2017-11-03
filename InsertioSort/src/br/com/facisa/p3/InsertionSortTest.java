package br.com.facisa.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
	int[] vetor= {16,11,9,2,1,8,0,-1};
	@Test
	void test() {
		InsertionSort insert = new InsertionSort();
		insert.insertion(vetor);
		int[] vetorordenado = {-1,0,1,2,8,9,11,16};
		Assert.assertArrayEquals(vetor, vetorordenado);
		
	}

}
