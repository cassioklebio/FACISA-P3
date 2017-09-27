package br.com.facisa.p3.atividade3;

public class Deque {
	private static final int ALOCACAO = 8;
	private int posicao=0;
	
	
	int[] deque = new int[ALOCACAO];
	
	public void inserirInicio(int numero) {
		if(deque.length==0) {
			throw new IllegalArgumentException("O Deque esta vazio");
		}
		deque[posicao]=numero;
		posicao++;
		
	}
	
	public void inserirFim(int numero) {
		if(tamanho()==0) {
			throw new IllegalArgumentException("O Dque esta vazio");
		}
		deque[posicao-1]=numero;
		posicao++;
		
	}
	
	public int removerInicio(int numero) {
		int temp = -1;
		temp = deque[0];
		deque[0]=0;
		for(int i=0;i<deque.length;i++) {
			deque[i]=deque[i+1];
			
		}
		posicao--;
		return temp;
	}
	
	public int removerFim(int numero) {
		int temp = -1;
		temp  = deque[posicao-1];
		deque[posicao-1]=0;
		posicao--;
		
		return temp;
		
	}
	
	public int tamanho() {
		return posicao;
	}
	
	public int primeiroElemento() {
		return deque[0];
	}
	
	public int ultimoElemento() {
		return deque[posicao-1];
	}
	public boolean isEmpty() {
		if(posicao==0) {
		return true;
	}
		return false;
	}
}
