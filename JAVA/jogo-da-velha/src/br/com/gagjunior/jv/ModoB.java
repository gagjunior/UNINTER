/**
 * Classe para criar um modo de jogo do tipo 'ModoB'.
 * Esta e uma classe filha de Computador
 * Neste modo o computador tenta jogar nas diagonais
 * 
 * @author Gilberto A. G. Junior
 * @ru 143586
 * @since 14/10/2021
 * */

package br.com.gagjunior.jv;

public class ModoB extends Computador {

	ModoB(String simbolo, Tabuleiro tab) {
		super(simbolo, tab);
	}
	
	ModoA modoA = new ModoA(this.getSimbolo(), this.tab);

	// Forca as jogadas pelas diagonais
	// Se nao for possivel jogar nas diagonais joga no ModoA (aleatorio)
	@Override
	boolean jogar() {
		if (!posicaoEhLivre(0) && !tab.campo[0].equals(getSimbolo())) {
			if (!posicaoEhLivre(2) && !tab.campo[2].equals(getSimbolo())) {
				modoA.jogar();
			} else if (posicaoEhLivre(2)) {
				tab.campo[2] = getSimbolo();
			} else if (tab.campo[2].equals(getSimbolo()) && posicaoEhLivre(4)) {
				tab.campo[4] = getSimbolo();				
			} else if (tab.campo[4].equals(getSimbolo()) && posicaoEhLivre(6)) {
				tab.campo[6] = getSimbolo();
			} else {
				modoA.jogar();
			}
			
		} else if (posicaoEhLivre(0)) {
			tab.campo[0] = getSimbolo();
		} else if (tab.campo[0].equals(getSimbolo()) && posicaoEhLivre(4)) {
			tab.campo[4] = getSimbolo();
		} else if (tab.campo[4].equals(getSimbolo()) && posicaoEhLivre(8)) {
			tab.campo[8] = getSimbolo();
		} else {
			modoA.jogar();
		}

		return true;
	}

}
