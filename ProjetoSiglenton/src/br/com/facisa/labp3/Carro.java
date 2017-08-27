package br.com.facisa.labp3;

public class Carro {
	/*
	 * Atributos (variaveis)privados que não serao 
	 * "visiveis"fora da classe.
	 * 
	 * */	
	private static final Carro INSTANCE = new Carro();
	
	
	
	//Construtor privado
	private Carro() 
	{//Operações de inicialização da classe;
	}
	
	/*
	 * Metodo responsavel pelo controle de uma unica instancia
	 */
	//Metodo publico estatico realizado o primeiro e unico acesso necessario nesse tipo de aplicação
	public static Carro getInstance()
	{	return INSTANCE;		
	}
	
	
	/*Metodos publicos que serão visiveis em todo o sistema.
	 * 
	 */
	//Aqui vou poder executar ese metodo de qualquer lugar do meu projeto.
	public static void Andar()
	{	System.out.print("Carro esta andando....");
	}
	
	//Aqui vou poder executar ese metodo de qualquer lugar do meu projeto.
	public static void Parar()
	{	System.out.print("Parou o carro...");		
	}
	
}
