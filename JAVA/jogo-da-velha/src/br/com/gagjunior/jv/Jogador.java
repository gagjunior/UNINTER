package br.com.gagjunior.jv;

public abstract class Jogador {
	
	private String simbolo;
	private int vitorias;
	
	Jogador (String simbolo) {
		this.simbolo = simbolo;		
	}	
	
	
	boolean jogar(Tabuleiro tab, int posicao) {
		int pos = posicao - 1;
		if (!posicaoEhLivre(tab, pos)) {
			System.out.println("Posição " + posicao +  " não está livre");
			return false;
		}
		tab.campo.add(pos, simbolo);
		return true;			
	}
	
	boolean posicaoEhLivre(Tabuleiro tab, int posicao) {
		int pos = posicao - 1;
		if (!tab.campo.get(pos).equals("-")) {
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
