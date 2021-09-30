package br.com.gagjunior.jv;

public class Humano extends Jogador {
	
	private String nome;

	Humano(String simbolo, Tabuleiro tab, String nome) {
		super(simbolo, tab);
		this.nome = nome;		
	}	
	
	@Override
	public boolean jogar(int posicao) {
		int indice = posicao - 1;
		
		if (!posicaoEhValida(posicao)) {
			System.out.println("O valor digitado deve estar entre 1 e 9!");
			return false;
		}
		
		if (!posicaoEhLivre(indice)) {
			System.out.println("A posição do numero " + (posicao) + " não está livre!");
			return false;			
		}
		
		tab.campo.add(indice, this.getSimbolo());
		
		return true;
	}
	
	boolean posicaoEhValida(int posicao) {		
		return posicao > 9 ? false : true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}
