package br.com.pacote2;

import br.com.pacote1.ClassePublicPacote1;

public class ClassePublicPacote2 {
	
	    //instanciando as classe 
		ClassePublicPacote2 a;
		ClasseDefaultPacote2 b;
	    ClassePublicPacote1 c;
		//ClasseDefaultPacote1 d; //  
	    
	    
	    public ClassePublicPacote2() {
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
