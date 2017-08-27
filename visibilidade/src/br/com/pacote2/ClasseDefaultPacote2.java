package br.com.pacote2;


import br.com.pacote1.ClassePublicPacote1;

class ClasseDefaultPacote2 {
	
	//instanciando as classe 
		 ClassePublicPacote1 a;
		 //ClasseDefaultPacote1 b;//não é permitido o acesso a classe Default de outro pacotes
		 ClassePublicPacote2 c;
		 ClasseDefaultPacote2 d; 
		
	
	public ClasseDefaultPacote2() {
       
		//instanciando as classe 
		ClassePublicPacote1 a;
		//ClasseDefaultPacote1 b;
		ClassePublicPacote2 c;
		//ClasseDefaultPacote2 d; //não é permitido o acesso a classe Default de outro pacotes
		
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
