package br.com.facisa.listaencadeada;

public class NoLista {
	private int quantElementos;
	private Peca inicio;
	private Peca fim;
	
	
	public NoLista() {
		this.quantElementos = 0;
		this.inicio = null;
		this.fim = null;
		
	}
	
	public void inserirNoInicio(int numero){
		if(numero == 0){
			throw new IllegalArgumentException("Valor fornecido é invalido");
		}
		 Peca peca = new Peca();
		 peca.setNumero(numero);
		 peca.setProximo(inicio);
		 inicio = peca;
		 this.quantElementos++;
		
	}	
	public void inserirNoFinal(int numero){
		if(numero == 0){
			throw new IllegalArgumentException("Valor fornacido é invalido");
		}
		Peca peca = new Peca();
		peca.setNumero(numero);
		if(quantElementos == 0){
			peca.setProximo(fim);
			this.inicio = peca;
			this.fim = peca;
		}else{
			fim.setProximo(peca);
			fim = peca;
		}
		this.quantElementos++;
	}
	
	
	public void inserirNoMeio(int posicao, int numero){
		Peca peca = new Peca();
		peca.setNumero(numero);
		Peca aux = inicio;
		if(posicao < this.quantElementos){
			this.inserirNoFinal(numero);
		}else{
			if(posicao == 0){
				this.inserirNoInicio(numero);
			}else{
				for(int i = 0; i<posicao;i++){
					aux = aux.getProximo();
					break;
				}
				peca.setProximo(aux.getProximo());
				aux.setProximo(peca);
				aux = peca;
			}
		}
	}
	public Peca removerNoInicio(){
		Peca aux = null;
		if(quantElementos != 0){
			aux = this.inicio;
			inicio = inicio.getProximo();
			inicio.setProximo(null);
			this.quantElementos--;
		}
		
		return aux;
	}
	
	public Peca removerNoFinal(){
		Peca temp = null;
		if(quantElementos != 0){
			Peca aux = this.inicio;
			while(aux.getProximo()!= null){
				aux = aux.getProximo();
				temp = aux;
			}
			aux.setProximo(null);
			quantElementos--;
		}
		return temp;
	}
	
	public Peca buscaElemento(int numero){
		Peca aux = this.inicio;
		while(aux != null){
			if(aux.getNumero()==numero){
				
			}
		}
		
		return null;
		
	}
	
	
	
	
	
	
	

}
