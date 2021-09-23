package br.com.gagjunior.jv;

public abstract class Jogador {
	
	private char simbolo;
	
	Jogador (char simbolo) {
		this.simbolo = simbolo;		
	}
	
	public char getSimbolo() {
		return simbolo;
	}
	
	public void setSimbolo(char simbolo) {
		this.simbolo = simbolo;		
	}
	
	boolean jogar(int linha, int coluna, Tabuleiro tab) {
		if (!campoEhLivre(linha, coluna, tab)) {
			return false;			
		}
		
		tab.campo[linha][coluna] = simbolo;
		return true;
	}
	
	boolean campoEhLivre(int linha, int coluna, Tabuleiro tab) {
		if (tab.campo[linha][coluna] == '-') {
			return true;
		}
		return false;			
	}	

}
