package br.com.gagjunior.jv;

public abstract class Jogador {
	
	private String simbolo;
	private int vitorias;
	
	Jogador (String simbolo) {
		this.simbolo = simbolo;		
	}	
	
	
	boolean jogar(Tabuleiro tab, int posicao) {
		tab.campo.add(posicao - 1, simbolo);
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
