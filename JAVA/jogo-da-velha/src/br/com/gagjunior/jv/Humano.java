package br.com.gagjunior.jv;

import java.util.Scanner;

public class Humano extends Jogador {
	
	private String nome;
	private int posicao;

	Humano(String simbolo, Tabuleiro tab, String nome) {
		super(simbolo, tab);
		this.nome = nome;		
	}	
	
	@Override
	public boolean jogar() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o numero da posição que deseja jogar: ");
		try {
			posicao = teclado.nextInt() ;
			teclado.nextLine();
			posicao -= 1;
			
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			teclado.close();			
		}
		
		
		if (!posicaoEhValida(posicao + 1)) {
			System.out.println("O valor digitado deve estar entre 1 e 9!");
			return false;
		}
		
		if (!posicaoEhLivre(posicao)) {
			System.out.println("A posição do numero " + (posicao + 1) + " não está livre!");
			return false;			
		}
		
		this.tab.campo.add(posicao, getSimbolo());
		return true;
	}
	
	boolean posicaoEhValida(int posicao) {		
		return posicao < 1 || posicao > 9 ? false : true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}
