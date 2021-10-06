package br.com.gagjunior.jv;

public class ModoC extends Computador {

	ModoA modoA = new ModoA(this.getSimbolo(), this.tab);

	ModoC(String simbolo, Tabuleiro tab) {
		super(simbolo, tab);
	}

	@Override
	boolean jogar() {

		if (!posicaoEhLivre(0) && !tab.campo[0].equals(getSimbolo())) {
			
			if (!posicaoEhLivre(1) && !tab.campo[1].equals(getSimbolo())) {
				
				if (!posicaoEhLivre(2) && !tab.campo[2].equals(getSimbolo())) {
					modoA.jogar();					
				}
				
			}			
			
			// Tenta jogar nas horizontais
			if (!posicaoEhLivre(3) && !tab.campo[3].equals(getSimbolo())) {
				
				if (!posicaoEhLivre(6) && !tab.campo[6].equals(getSimbolo())) {
					modoA.jogar();
				} else if (posicaoEhLivre(6)) {
					tab.campo[6] = getSimbolo();
				} else if (tab.campo[6].equals(getSimbolo()) && posicaoEhLivre(7)) {
					tab.campo[7] = getSimbolo();
				} else if (tab.campo[7].equals(getSimbolo()) && posicaoEhLivre(8)) {
					tab.campo[8] = getSimbolo();					
				} else {
					modoA.jogar();
				}
				
			} else if (posicaoEhLivre(3)) {
				tab.campo[3] = getSimbolo();				
			} else if (tab.campo[3].equals(getSimbolo()) && posicaoEhLivre(4)) {
				tab.campo[4] = getSimbolo();				
			} else if (tab.campo[4].equals(getSimbolo()) && posicaoEhLivre(5)) {
				tab.campo[5] = getSimbolo();				
			} else {
				modoA.jogar();
			}
			
		} else if (posicaoEhLivre(0)) {
			tab.campo[0] = getSimbolo();			
		} else if (tab.campo[0].equals(getSimbolo()) && posicaoEhLivre(1)) {
			tab.campo[1] = getSimbolo();			
		} else if (tab.campo[1].equals(getSimbolo()) && posicaoEhLivre(2)) {
			tab.campo[2] = getSimbolo();			
		} else {
			modoA.jogar();
		}

		return true;
	}

}
