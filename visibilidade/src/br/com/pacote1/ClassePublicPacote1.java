package br.com.pacote1;

import br.com.pacote2.ClassePublicPacote2;

public class ClassePublicPacote1 {
	
	
	//instanciando as classe 
	ClassePublicPacote1 a;
	ClasseDefaultPacote1 b;
	ClassePublicPacote2 c;
	//ClasseDefaultPacote2 d; //
	
	public ClassePublicPacote1() {
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

	protected void protectesMetodo() {
	}
	
	}
	

	

