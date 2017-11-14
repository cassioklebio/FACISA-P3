package br.com.facisa.p3;


public class Principal {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		
		
		aluno1.setNome("cassio");
		aluno2.setNome("Tereziana");
		aluno3.setNome("Dorinha");
		aluno4.setNome("Denor");
		
		Fila fila = new Fila(3);
		fila.enqueue(aluno1);
		fila.enqueue(aluno2);
		fila.enqueue(aluno3);
		fila.enqueue(aluno4);
		
		fila.dequeue();
		
		
		System.out.print(fila);

	}

}
