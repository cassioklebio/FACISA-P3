package br.com.facisa.p3.listasequencial;

import java.io.InvalidObjectException;

public class Lista <T>{
	private static final int ALOCACAO = 2;
	
	private T[] lista = (T[]) new Object[ALOCACAO];
	
	private int inseridos= 0;
	
	public void inserir(T objeto) {
		if(inseridos==lista.length) {
			 T[] novaLista = (T[]) new Object[lista.length*2];
			for(int i =0; i<lista.length;i++) {
				novaLista[i] = lista[i];
			}
			lista = novaLista;
		}
		
		lista[inseridos]= objeto;
		inseridos++;
	}
	public void inserirPorPosicao(int posicao) {
		T objeto = null;
		if(posicao > lista.length) {
			throw new IllegalArgumentException("posicao invalida");
		}
		lista[posicao]= objeto;
	}
	
	public void excluir(T objeto)throws InvalidObjectException {
		int posicaoObjeto = obterPosicao(objeto);
		
		lista[posicaoObjeto]=null;
		
	}
	public void excluirPorPosicao (int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		for (int i = posicao; i < this.inseridos -1; i++) {
			this.lista[i] = this.lista[i+1];
		}
		this.inseridos--;
			
		
	}
	private int obterPosicao(T objeto) {
		int posicao = -1;
		for(int i =0; i<lista.length;i++) {
			if(lista[i]!=null && lista[i].equals(objeto)) {
				posicao = i;
				break;
			}
		}
		return posicao;
	}
	
	
	public int tamanho() {
		return inseridos;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao < this.lista.length && posicao >=0;
	}
	
	public boolean isEmpty() {
		return inseridos==0;
	}
		

}
