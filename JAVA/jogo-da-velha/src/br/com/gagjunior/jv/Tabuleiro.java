package br.com.gagjunior.jv;

public class Tabuleiro {

	private int jogadas;
	private int partidas;

	private int tamanhoCampo = 9;
	String campo[] = new String[tamanhoCampo];
	
	Tabuleiro() {
		limpaTabuleiro();
	}

	void limpaTabuleiro() {
		for (int i = 0; i < tamanhoCampo; i++) {
			campo[i] = "-";
		}
	}

	public int getJogadas() {
		return jogadas;
	}

	public void setJogadas(int jogadas) {
		this.jogadas = jogadas;
	}

	public int getPartidas() {
		return partidas;
	}

	public void setPartidas(int partidas) {
		this.partidas = partidas;
	}
	
	boolean verificaGanhador() {
		
		if (jogadas >= 5) {
			
			if () {
				
			}
						
		}
		return false;
	}

	void imprimirTabuleiro() {
		System.out.println("Posicoes | Tabuleiro\n");
		for (int i = 0; i < tamanhoCampo; i++) {

			if (campo[i].equals("-")) {
				System.out.print(" " + (i + 1) + " ");
			} else {
				System.out.print(" - ");
			}

			if (i == 2) {
				System.out.print("|");
				for (int j = 0; j <= 2; j++) {
					System.out.print(" " + campo[j] + " ");
				}
				System.out.println();
			}

			if (i == 5) {
				System.out.print("|");
				for (int k = 3; k <= 5; k++) {
					System.out.print(" " + campo[k] + " ");
				}
				System.out.println();
			}

			if (i == 8) {
				System.out.print("|");
				for (int l = 6; l < tamanhoCampo; l++) {
					System.out.print(" " + campo[l] + " ");
				}
			}
		}
		System.out.println();
	}
}
