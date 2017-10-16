package br.com.facisa.p3.bubllesort;



public class BublleSort {
	
	private int tamanho;
	private int inseridos = 0;
	private int[] ordenacao;
	
	
	
	public BublleSort(int tamanho) {
		
		ordenacao = new int[tamanho];
	}



	public void adiciona(int valor) {
		ordenacao[inseridos] = valor;
		inseridos++;		
	}
	
	public void imprimiDesordenado() {
		System.out.print("[");
		for(int i = 0; i<ordenacao.length;i++) {
			System.out.print(ordenacao[i]+" ");
		}
		System.out.print("]");
	}
	public void imprimiOrdenado() {
		System.out.print("[");
		for(int i = 0; i<ordenacao.length;i++) {
			System.out.print(ordenacao[i]+" ");
		}
		System.out.print("]");
	}
	public void listaOrdenada() {
		for(int i = 0; i < ordenacao.length; ++i){
			 boolean controle = true;
			 for(int j = 0; j < (ordenacao.length - 1); ++j){
			 
			 if(ordenacao[j] > ordenacao[j + 1]){
			 int temp = ordenacao[j];
			 ordenacao[j] = ordenacao[j + 1];
			 ordenacao[j + 1] = temp;
			 controle = false;
			 }
			 }
			 if(controle){
			 break;
			 }
			 
			 }
		
	}
	
	
	
	
	
	
	
	
}
