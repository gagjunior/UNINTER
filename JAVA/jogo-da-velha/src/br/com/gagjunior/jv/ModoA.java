/**
 * Classe para criar um modo de jogo do tipo 'ModoA'.
 * Esta e uma classe filha de Computador
 * Neste modo o computador joga aleatoriamente
 * 
 * @author Gilberto A. G. Junior
 * @ru 143586
 * @since 14/10/2021
 * */

package br.com.gagjunior.jv;

import java.util.Random;

public class ModoA extends Computador {
	
	private int posicao = 0;

	ModoA(String simbolo, Tabuleiro tab) {
		super(simbolo, tab);
		
	}

	// Sobrescreve o metodo jogar
	// Joga no modo aleatorio
	@Override
	boolean jogar() {
		
		if (tab.getJogadas() < 8) {
			
			Random aleatorio = new Random();
			this.posicao = aleatorio.nextInt(8);
			
			// Verifica se a posicao esta livre
			while (!posicaoEhLivre(posicao)) {
				posicao = aleatorio.nextInt(8);
			}
			
			tab.campo[posicao] = getSimbolo();
			
			return true;
		}
		return false;
				
	}

}
