package br.com.pacote1;

import br.com.pacote2.ClassePublicPacote2;

class ClasseDefaultPacote1 {
	
	//instanciando as classe 
	ClassePublicPacote1 a;
	ClasseDefaultPacote1 b;
	ClassePublicPacote2 c;
	//ClasseDefaultPacote2 d; //não é permitido o acesso a classe Default de outro pacotes
	
	public ClasseDefaultPacote1() {
		a.defaultMetodo();
		b.publicMetodo();
		//c.privateMetodo(); //não é permitido o acesso ao metodo privado.
		//d.protectedMetod();//não é permitido o acesso ao metodo protected.
		
		// TODO Auto-generated constructor stub
	}
	

	void defaultMetodo() {
	}

	public void publicMetodo() {
	}

	private void privateMetodo() {
	}

	protected void protectedMetodo() {
	}

}
