package br.com.facisa.p3.bubllesort;

import java.util.Scanner;

public class MainBuble {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do array  ");
		int tamanho = ler.nextInt();
		BublleSort buble = new BublleSort(tamanho);
		for(int i = 0; i<tamanho;i++) {
		System.out.print("Digite o numero ");
		int valor = ler.nextInt();
		buble.adiciona(valor);
		}
		buble.imprimiDesordenado();
		
		buble.listaOrdenada();
		
		buble.imprimiOrdenado();
		
		

 

 
 
 
 
 
}

		
	}


