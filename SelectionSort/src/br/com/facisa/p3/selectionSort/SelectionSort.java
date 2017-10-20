package br.com.facisa.p3.selectionSort;

public class SelectionSort {
	private int[] vetor;
	private int tamanho;
	private int inseridos;
	
	
	/**
	 * metodo construtor passando o tamanho do vetor
	 * @param tamanho
	 */
	public SelectionSort(int tamanho) {
		vetor= new int[tamanho];
	}


	/**
	 * metodo para inserir
	 * @param valor
	 */
	public void inserir(int valor) {
		vetor[inseridos]=valor;
		inseridos++;
		
	}
	/**
	 * metodo para imprimir
	 */
	public void imprimir() {
		System.out.print("[");
		for(int i = 0; i <vetor.length;i++) {
			System.out.print(" "+vetor[i]);
		}
		System.out.print("]");
	}
	
	/**
	 * metodo que faz a ordenação
	 */
	public void selectionsort() {
		int min;
		for(int i = 0;i<vetor.length-1;i++) {
			min = i;
			for(int j = i+1; j<vetor.length;j++) {
				if(vetor[j]<vetor[min]) {
					min= j;
				}
				
			}
			if(i !=min) {
				int swap = vetor[i];
				vetor[i]= vetor[min];
				vetor[min]= swap;
			}
		}
		
	}
	
	

}
