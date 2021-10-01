package br.com.gagjunior.jv;

import java.util.Random;

public class ModoA extends Computador {
	
	private int posicao = 0;

	ModoA(String simbolo, Tabuleiro tab) {
		super(simbolo, tab);
		
	}

	@Override
	boolean jogar() {
		
		Random aleatorio = new Random();
		this.posicao = aleatorio.nextInt(8);
		
		while (!posicaoEhLivre(posicao)) {
			System.out.println(posicao);
			posicao = aleatorio.nextInt(8);
		}
		
		tab.campo[posicao] = getSimbolo();
		
		return true;		
	}

}
