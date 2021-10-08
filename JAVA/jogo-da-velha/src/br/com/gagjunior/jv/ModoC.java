package br.com.gagjunior.jv;

public class ModoC extends Computador {

	ModoA modoA = new ModoA(this.getSimbolo(), this.tab);

	ModoC(String simbolo, Tabuleiro tab) {
		super(simbolo, tab);
	}

	@Override
	boolean jogar() {
		
		// Tenta sempre jogar nas horizontais
		for (int i = 0; i < tab.campo.length; i++) {
			
			if (posicaoEhLivre(i)) {
				registraPosicao(i, getSimbolo());
				return true;
			}
			
			if (!posicaoEhLivre(i) && posicaoEhIgual(i, getSimbolo()) && posicaoEhLivre(i + 1)) {
				registraPosicao(i + 1, getSimbolo());
				return true;
				
			} else if (!posicaoEhIgual(i + 1, getSimbolo())) {
				
				// Tenta jogar nas verticais se não conseguir nas horizontais				
				for (int j = 0; j <= 6; j+=3 ) {					
					if (posicaoEhLivre(j)) {
						registraPosicao(j, getSimbolo());
						return true;
					}					
				}
				
				for (int k = 1; k <= 7; k+=3 ) {					
					if (posicaoEhLivre(k)) {
						registraPosicao(k, getSimbolo());
						return true;
					}					
				}
				
				for (int l = 2; l <= 8; l+=3 ) {					
					if (posicaoEhLivre(l)) {
						registraPosicao(l, getSimbolo());
						return true;
					}					
				}
				
				return true;
			}
			
		}
		
		return true;
	}

}
