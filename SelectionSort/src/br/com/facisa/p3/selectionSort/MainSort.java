package br.com.facisa.p3.selectionSort;

import java.util.Scanner;

public class MainSort {

	

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		System.out.print("Digite o taanho do array: ");
		int tamanho =ler.nextInt();
		SelectionSort sort = new SelectionSort(tamanho);
		
		for(int i = 0; i<tamanho;i++) {
			System.out.print("Digite o numero: ");
			int numero = ler.nextInt();
			sort.inserir(numero);
			
		}
		sort.imprimir();
		sort.selectionsort();
		sort.imprimir();
	}

}
