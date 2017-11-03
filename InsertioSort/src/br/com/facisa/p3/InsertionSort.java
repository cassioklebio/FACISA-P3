package br.com.facisa.p3;

public class InsertionSort {
	/**
	 * 
	 * metor executa a ordenação pelo metodo Insert Sort
	 */
	
	public static void insertion(int[] vetor) {
		//for que percorre todo o vetor
		for(int i = 1; i < vetor.length;i++) {
			int temp = vetor[i];//variavel que guarda o valor do velor da posicao 1;
			int j = i-1;//j = 0
			//laço de faz a troca dos valores
			while(j>=0 && temp < vetor[j]) {
				vetor[j+1] = vetor[j];
				j--;
			}
			
			vetor[j+1] = temp;
		}
		
	}
	

}
