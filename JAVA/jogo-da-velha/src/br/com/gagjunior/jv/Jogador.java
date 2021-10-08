package br.com.gagjunior.jv;

public abstract class Jogador {
	
	private String simbolo;
	private int vitorias;
	Tabuleiro tab;
	
	Jogador (String simbolo, Tabuleiro tab) {
		this.simbolo = simbolo;
		this.tab = tab;
	}
	
	
	boolean jogar() {
		return true;
	}
	
	boolean jogar(int posicao) {
		return true;
	}
	
	boolean posicaoEhLivre(int indice) {
		return tab.campo[indice].equals("-") ? true : false;
	}
	
	boolean posicaoEhIgual(int indice, String simbolo) {		
		return tab.campo[indice].equals(simbolo) ? true : false;
	}
	
	void registraPosicao(int indice, String simbolo) {
		tab.campo[indice] = simbolo;		
	}
		
	
	public String getSimbolo() {
		return simbolo;
	}
	
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;		
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}	
	

}
