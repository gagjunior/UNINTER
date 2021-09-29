package br.com.gagjunior.jv;

public abstract class Jogador {
	
	private String simbolo;
	private int vitorias;
	Tabuleiro tab;
	
	Jogador (String simbolo, Tabuleiro tab) {
		this.simbolo = simbolo;
		this.tab = tab;
	}
	
	abstract boolean jogar();
	
	boolean posicaoEhLivre(int indice) {
		if (!tab.campo.get(indice).equals("-")) {
			return false;			
		}
		return true;
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
