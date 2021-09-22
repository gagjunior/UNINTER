package br.com.gagjunior.jv;

import java.util.Scanner;

//Classe principal
public class JogoDaVelha {

	public static void main(String[] args) {
		
		//Titulo do jogo
		exibirTitulo();
		
		String nomeJogador;
		int modoJogo;
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nomeJogador = teclado.nextLine();
		
		System.out.println("\n" + nomeJogador + ", Seja bem vindo ao jogo da velha!!\n");
		
		System.out.println("***Modos de Jogo***");
		System.out.println("1 - Modo A");
		System.out.println("2 - Modo B");
		System.out.println("3 - Modo C");
		System.out.print("\nDigite o numero do mode que deseja jogar: \n");
		
		modoJogo = teclado.nextInt();

		if (modoJogo == 1) {
			System.out.println("Você escolheu o modo 'A'");
		} else if (modoJogo == 2) {
			System.out.println("Voce escolheu o modo 'B'");			
		} else {
			System.out.println("Você escolheu o modo 'C'");
		}
		
		
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
