package br.com.gagjunior.jv;

public class ModoB extends Computador {

	ModoB(String simbolo, Tabuleiro tab) {
		super(simbolo, tab);
	}

	@Override
	boolean jogar() {
		if (posicaoEhLivre(0)) {
			tab.campo[0] = getSimbolo();
			return true;
		} else if (tab.campo[0].equals(getSimbolo()) && posicaoEhLivre(4)) {
			tab.campo[4] = getSimbolo();
			return true;
		}
		
		return false;		
	}

}
