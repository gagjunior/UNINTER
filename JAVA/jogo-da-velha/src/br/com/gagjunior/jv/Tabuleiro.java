package br.com.gagjunior.jv;

public class Tabuleiro {
	
	char campo[][] = new char[3][3];
	
	Tabuleiro() {
		
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo.length; j++) {
				campo[i][j] = '-';								
			}			
		}
	}
	
	void imprimir() {
		System.out.println("**** TABULEIRO ****");
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo.length; j++) {
				campo[i][j] = '-';
				System.out.print("L" + (i + 1) + "C" + (j + 1) + " ");
			}
			System.out.println("\n");
		}
		
	}
}
