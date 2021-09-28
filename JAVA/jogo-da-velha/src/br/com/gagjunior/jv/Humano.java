package br.com.gagjunior.jv;

import java.util.Scanner;

public class Humano extends Jogador {
	
	private String nome;

	

	Humano(String simbolo, String nome) {
		super(simbolo);
		this.nome = nome;
		
	}

	
	boolean jogar(Tabuleiro tab, Scanner teclado) {
		System.out.print("Digite o numero da posição que deseja jogar: ");
		
		try {
			teclado.nextInt();
			teclado.nextLine();
			return true;
		} catch (Exception e) {
			e.getMessage();
			return false;
		}
		
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
