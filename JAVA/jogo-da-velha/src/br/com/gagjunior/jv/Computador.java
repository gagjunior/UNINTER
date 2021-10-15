/**
 * Classe para criar um jogador do tipo 'Computador'.
 * Esta e uma classe filha de Jogador
 * Esta e uma classe pai para criar os modos de jogo
 * 
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
