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
	
	void imprimirTabuleiro() {
		System.out.println("Posições | Tabuleiro\n");
		for (int i=0; i < tamanhoCampo; i++) {
			
			if (campo.get(i).equals("-")) {
				System.out.print(" " + (i + 1) + " ");
			} else {
				System.out.print(" - ");
			}
				
			if (i == 2) {
				System.out.print("|");
				for (int j=0; j <= 2; j++) {
					System.out.print(" " + campo.get(j) + " ");					
				}
				System.out.println();				
			}
			
			if (i == 5) {
				System.out.print("|");
				for (int k = 3; k <= 5; k++) {
					System.out.print(" " + campo.get(k) + " ");					
				}
				System.out.println();
			}
			
			if (i == 8) {
				System.out.print("|");
				for (int l = 6; l < tamanhoCampo; l++) {
					System.out.print(" " + campo.get(l) + " ");		
				}				
			}
		}
		System.out.println();
	}
}
