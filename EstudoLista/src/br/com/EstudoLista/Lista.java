package br.com.EstudoLista;

import java.util.Arrays;

public class Lista<T> {

	private static final int ALOCACAO = 10;

	private T[] arrayInterno = (T[]) new Object[ALOCACAO];

	private int inseridos = 0;

	public void adiciona(T objeto) {
		if (inseridos == arrayInterno.length) {
			T[] novoArray = (T[]) new Object[arrayInterno.length * 2];
			for (int i = 0; i < arrayInterno.length; i++) {
				novoArray[i] = arrayInterno[i];

			}
			arrayInterno = novoArray;

		}
		arrayInterno[inseridos] = objeto;
		inseridos++;

	}

	public T excluir(T objeto) {
		T temp = null;
		for (int i = 0; i < arrayInterno.length; i++) {
			if (arrayInterno[i].equals(objeto)) {
				temp = arrayInterno[i];
				arrayInterno[i] = null;
				arrayInterno[i] = arrayInterno[i + 1];
			}

		}
		return temp;

	}

	public int pegaPosicao(T objeto) {
		int posicao = -1;
		for (int i = 0; i < arrayInterno.length; i++) {
			if (arrayInterno[i] != null && arrayInterno[i].equals(objeto)) {
				posicao = i;
				break;
			}
		}

		return posicao;

	}	

	public boolean isEmpty(Aluno aluno) {
		return inseridos > 0;
	}

	public int tamanho() {
		return inseridos;

	}

}
