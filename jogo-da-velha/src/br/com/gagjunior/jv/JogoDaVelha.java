package br.com.gagjunior.jv;

import java.util.Scanner;

//Classe principal
public class JogoDaVelha {

	public static void main(String[] args) {
		
		//Titulo do jogo
		exibirTitulo();
		
		String nomeJogador;
		String modoJogo;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nomeJogador = teclado.nextLine();
		
		System.out.println("\n" + nomeJogador + ", Seja bem vindo ao jogo da velha!!\n");
		
		System.out.println("Digite um numero entre 1 e 3 para escolher o modo de jogo...");
		System.out.println("1 - Modo A");
		System.out.println("2 - Modo B");
		System.out.println("1 - Modo C");
		
		modoJogo = teclado.nextLine();
		
		teclado.close();
		

	}
	
	// Exibir titulo do jogo
	static void exibirTitulo() {
		System.out.println("XOXOXOXOXOXOXOXOXOXOXOXOXOXOX");
		System.out.println("X      JOGO DA VELHA        O");
		System.out.println("XOXOXOXOXOXOXOXOXOXOXOXOXOXOX");
		System.out.println();		
	}

}
