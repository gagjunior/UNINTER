/**
 * Classe para criar um tabuleiro
 * Esta classe controla o estado do tabuleiro no jogo
 * 
 * O tabuleiro pode ser uma matrix 3 X 3 ou um array de 9 posicoes
 * Esta classe utiliza o metodo de um array de 9 posicoes
 * 
 * @author Gilberto A. G. Junior
 * @ru 143586
 * @since 14/10/2021
 * */

package br.com.gagjunior.jv;

public class Tabuleiro {

	private int jogadas;
	private int partidas;

	// Tabuleiro pode ser uma matriz 3x3 ou um array de 9 posicoes
	// Cria um array de 9 posicoes
	private int tamanhoCampo = 9;
	String campo[] = new String[tamanhoCampo];

	Tabuleiro() {
		limpaTabuleiro();
	}

	// Seta um simbolo que significa que a posicao esta vazia
	void limpaTabuleiro() {
		for (int i = 0; i < tamanhoCampo; i++) {
			campo[i] = "-";
		}
	}

	// Verifica se houve um simbolo ganhador e retorna o simbolo ou vazio
	String simboloGanhador(int jogadas) {

		if (jogadas >= 5) {

			// Verifica se houve vencedor nas horizontais
			for (int i = 0; i <= 6; i += 3) {
				if (!campo[i].equals("-")) {
					if (campo[i].equals(campo[i + 1]) && campo[i + 1].equals(campo[i + 2])) {
						return campo[i];
					}
				}
			}

			// Verifica se houve vencedor nas verticais
			for (int j = 0; j < 3; j++) {
				if (!campo[j].equals("-")) {
					if (campo[j].equals(campo[j + 3]) && campo[j + 3].equals(campo[j + 6])) {
						return campo[j];
					}
				}
			}

			// Verifica se houve vencedor na 1 diagonal
			if (!campo[0].equals("-")) {
				if (campo[0].equals(campo[4]) && campo[4].equals(campo[8])) {
					return campo[0];
				}
			}

			// Verifica se houve vencedor na 2 diagonal
			if (!campo[2].equals("-")) {
				if (campo[2].equals(campo[4]) && campo[4].equals(campo[6])) {
					return campo[2];
				}
			}

			return "";
		}

		return "";
	}

	// Metodo que mostra o estado tabuleiro na tela
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

	//Getters e Setters
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
}
