package br.com.facisa.p3;

import java.util.Arrays;

public class Fila {
	private int size_fila;
	private Aluno[] alunos;
	private int inseridos;
	

	
	
	
	public Fila(int size_fila) {
		alunos = new Aluno[size_fila];
	}
	
	
	public void enqueue(Aluno aluno) {
		if(aluno != null) {
			if(inseridos == alunos.length) {
				criarEspaco();
			}
			alunos[inseridos]= aluno;
			inseridos++;
		}
	}
	
	public Aluno dequeue() {
		Aluno temp = null;
		temp = alunos[0];
		for(int i =0;i<inseridos;i++) {
			alunos[i]=alunos[i+1];
		}
		alunos[inseridos-1]=null;
		inseridos--;
		return temp;
		
	}
	
	
	public Aluno front() {
		return alunos[0];
	}
	
	
	public int size() {
		return inseridos;
		
	}
	public boolean isEmpty() {
		return inseridos==0;
	}
	
	private void criarEspaco() {
		Aluno[] novoArray = new Aluno[alunos.length*2];
		for(int i = 0; i < alunos.length;i++) {
			novoArray[i] = alunos[i];			
		}
		alunos = novoArray;
		
	}
	
	public String toString() {
		return Arrays.toString(alunos);
	}
	
	
	
	
}

	
	
	
	

