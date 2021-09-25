package br.com.gagjunior.jv;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	
	private int tamanhoCampo = 9;	
	List<String> campo = new ArrayList<>(tamanhoCampo);
	
	Tabuleiro() {
		for (int i=0; i < tamanhoCampo; i++) {
			campo.add("-");
		}				
	}
	
	void imprimirPosicoes() {
		System.out.println("Posições disponiveis");
		for (int i=0; i < tamanhoCampo; i++) {
			
			if (campo.get(i).equals("-")) {
				System.out.print(" " + (i + 1) + " ");
			} else {
				System.out.print(" - ");
			}		
				
			if (i == 2 || i == 5) {
				System.out.println();				
			}
		}		
		System.out.println();
	}
	
	void imprimirTabuleiro() {
		System.out.println("Estado atual do tabuleiro");
		for (int i=0; i < tamanhoCampo; i++) {
			
			System.out.print(" " + campo.get(i) + " ");
						
			if (i == 2 || i == 5) {
				System.out.println();				
			}
		}		
		System.out.println();
	}
}
