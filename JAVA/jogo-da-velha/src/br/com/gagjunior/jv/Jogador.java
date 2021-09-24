package br.com.gagjunior.jv;

public abstract class Jogador {
	
	private char simbolo;
	private int vitorias;
	
	Jogador (char simbolo) {
		this.simbolo = simbolo;		
	}	
	
	
	boolean jogar(Tabuleiro tab) {
		return true;
	}
	
	
	public char getSimbolo() {
		return simbolo;
	}
	
	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;		
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	

}
