/**
 * Classe para criar um jogador do tipo computador.
 * Esta é uma classe filha de Jogador
 * @author Gilberto A. G. Junior
 * @ru 143586
 * @since 14/10/2021
 * */

package br.com.gagjunior.jv;

public abstract class Computador extends Jogador {

	Computador(String simbolo, Tabuleiro tab) {
		super(simbolo, tab);
	}
}
