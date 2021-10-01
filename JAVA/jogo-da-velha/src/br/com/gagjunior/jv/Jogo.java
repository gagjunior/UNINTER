package br.com.gagjunior.jv;

import java.util.Scanner;

//Classe principal
public class Jogo {

	public static void main(String[] args) {
		
		String nomeJogador;
		int modoJogo = 0;
		int opcaoSimbolo = 0;
		char inicio;
		String simboloHum;
		String simboloComp;
		Tabuleiro tab = new Tabuleiro();
		Computador comp = null;
		
		//Titulo do jogo
		Interface.exibirTitulo();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nomeJogador = teclado.nextLine();
		
		System.out.println();
		
		//Escolhe simbolo
		Interface.solicitaSimbolo();
		
		opcaoSimbolo = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println();
		
		simboloHum = opcaoSimbolo == 1 ? "X" : "O";
		simboloComp = simboloHum.equals("X") ? "O" : "X";
		
		Humano humano = new Humano(simboloHum, tab, nomeJogador);
		
		//Boas vindas
		Interface.msgBoasVindas(humano);
		
		System.out.println();
	
		Computador maquina = setModoJogo(modoJogo, comp, simboloComp, teclado, tab);
		
		System.out.println();
		
		// Iniciar partida?
		Interface.msgIniciar();
				
		inicio = teclado.nextLine().toUpperCase().charAt(0);
		
		while (inicio == 'S') {
			System.out.println();
			
			tab.imprimirTabuleiro();
			
			System.out.println();
			
			Interface.solicitarPosicao();
			int posicao = teclado.nextInt();
			teclado.nextLine();
			humano.jogar(posicao);
			
			System.out.println();
			
			Interface.msgContinuarJogo();			
			inicio = teclado.nextLine().toUpperCase().charAt(0);
		}
		
		if (inicio == 'N') {
			System.out.println("\nQue pena...");
			System.out.println("Encerrando o jogo...");
		}
		
		teclado.close();
		
	}
	
	
	// Setar o modo de jogo
	static Computador setModoJogo (int modo, Computador comp, String simbolo, Scanner teclado, Tabuleiro tab) {
		
		Interface.msgModoJogo();
		
		modo = teclado.nextInt();		
		teclado.nextLine();
		
		if (modo == 1) {
			comp = new ModoA(simbolo, tab);
			System.out.println("\nVoce escolheu jogar no modo 'A'");
		} else if (modo == 2) {
			comp = new ModoB(simbolo, tab);			
			System.out.println("\nVoce escolheu jogar no modo 'B'");
		} else {
			comp = new ModoC(simbolo, tab);
			System.out.println("\nVoce escolheu jogar no modo 'C'");
		}
		return comp;
	}

}
