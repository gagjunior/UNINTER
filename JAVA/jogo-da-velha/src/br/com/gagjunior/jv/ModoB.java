package br.com.gagjunior.jv;

public class ModoB extends Computador {

	ModoB(String simbolo, Tabuleiro tab) {
		super(simbolo, tab);
	}
	
	ModoA modoA = new ModoA(this.getSimbolo(), this.tab);

	@Override
	boolean jogar() {
		if (!posicaoEhLivre(0) && !tab.campo[4].equals(getSimbolo())) {
			modoA.jogar();						
		}
		
		if (posicaoEhLivre(0)) {
			tab.campo[0] = getSimbolo();
			return true;
		} else if (tab.campo[0].equals(getSimbolo()) && posicaoEhLivre(4)) {
			tab.campo[4] = getSimbolo();
			return true;
		} else if (tab.campo[4].equals(getSimbolo()) && posicaoEhLivre(8)) {
			tab.campo[8] = getSimbolo();
		} else if (posicaoEhLivre(2)) {
			tab.campo[2] = getSimbolo();
			return true;
		} else if (tab.campo[2].equals(getSimbolo()) && posicaoEhLivre(4)) {
			tab.campo[4] = getSimbolo();
			return true;
		} else if (tab.campo[4].equals(getSimbolo()) && posicaoEhLivre(6)) {
			tab.campo[6] = getSimbolo();
		}

		return false;
	}

}
