package br.com.EstudoLista;

public class Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
	    Aluno a2 = new Aluno();

	    a1.setNome("João");
	    a2.setNome("José");

	    Lista lista = new Lista();

	    lista.adiciona(a1);
	    lista.adiciona(a2);

	    System.out.println(lista);

	}

}
