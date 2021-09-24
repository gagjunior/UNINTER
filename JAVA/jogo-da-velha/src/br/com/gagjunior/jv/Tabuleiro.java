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
		System.out.println("**** TABULEIRO ****");
		for (int i=0; i < tamanhoCampo; i++) {			
			System.out.print(" " + (i + 1) + " ");			
			if (i == 2 || i == 5) {
				System.out.println();				
			}
		}		
		System.out.println();
	}
}
