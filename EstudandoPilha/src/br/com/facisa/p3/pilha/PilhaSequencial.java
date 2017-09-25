package br.com.facisa.p3.pilha;

public class PilhaSequencial {
	private static final int ALOCACAO = 10;
	
	public Object[] pilha;
	
	public int posicaoPilha;

	public PilhaSequencial() {
		this.posicaoPilha = -1;
		this.pilha = new Object[ALOCACAO];
	}
	
	//METODO PARA VERIFICAR SE A PILHA ESTA VAZIA
	public boolean isEmpty() {
		if(this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}
	public int tamanho() {
		if(this.isEmpty()) {
			return 0;
		}
		return this.posicaoPilha+1;
	}
	public void push(Object valor) {
		if(this.posicaoPilha < this.pilha.length-1) {
		this.pilha[++posicaoPilha]=valor;
	}
	}
	public Object pop() {
		if(isEmpty()) {
		return null;
	}
		return this.pilha[this.posicaoPilha--];
	
	
	
	
	
	
	}	
	
	
	

}
