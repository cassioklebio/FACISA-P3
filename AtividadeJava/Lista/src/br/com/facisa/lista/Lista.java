package br.com.facisa.lista;

public class Lista <L> {
	
	private static final int ALOCACAO = 3;
	
	private L[] arrayInterno = (L[]) new Object[ALOCACAO]; 
	
	private int inseridos = 0;
	
	public void inserir(L objeto) {
		if(inseridos==arrayInterno.length) {
			
			L[] novoArray = (L[])new Object[arrayInterno.length*2];
			
			for(int i = 0; i< arrayInterno.length;i++) {
				novoArray[i] = arrayInterno[i];
				
			}
			arrayInterno= novoArray;
		}		
		arrayInterno[inseridos] = objeto;
		inseridos++;
		
	}
	public int tamanho() {
		return inseridos;
	}
	public void excluir(L objeto) {
		
		
	}

	
}
