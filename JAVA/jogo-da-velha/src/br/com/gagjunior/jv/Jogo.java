package br.com.gagjunior.jv;

import java.util.Scanner;

//Classe principal
public class Jogo {
	
	static String nomeJogador;
	static int modoJogo = 0;
	static int opcaoSimbolo = 0;
	static char inicio;
	static String simboloHum;
	static String simboloComp;
	static Tabuleiro tab = new Tabuleiro();
	static int partidas;
	static int jogadas;

	public static void main(String[] args) {
				
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
	
		Computador maquina = setModoJogo(modoJogo, simboloComp, teclado, tab);
		
		System.out.println();
		
		// Iniciar partida?
		Interface.msgIniciar();				
		inicio = teclado.nextLine().toUpperCase().charAt(0);
		
		while (inicio == 'S') {
			jogadas = 0;
			tab.setJogadas(jogadas);
			
			tab.limpaTabuleiro();
			System.out.println();
			
			tab.imprimirTabuleiro();			
			System.out.println();
			
			while (jogadas <= 9) {
				Interface.solicitarPosicao();
				int posicao = teclado.nextInt();
				teclado.nextLine();
				humano.jogar(posicao);
				jogadas++;
				maquina.jogar();
				jogadas++;
				
				System.out.println();
				tab.imprimirTabuleiro();
				System.out.println();
				
				tab.setJogadas(jogadas);
			}
			
			partidas++;
			
			System.out.println();
			
			Interface.msgContinuarJogo();			
			inicio = teclado.nextLine().toUpperCase().charAt(0);
		}
		
		tab.setPartidas(partidas);
		
		if (inicio == 'N') {
			System.out.println("\nQue pena...");
			System.out.println("Encerrando o jogo...");
		}
		
		teclado.close();
		
	}
	
	
	// Setar o modo de jogo
	static Computador setModoJogo (int modo, String simbolo, Scanner teclado, Tabuleiro tab) {
		
		Interface.msgModoJogo();
		
		modo = teclado.nextInt();		
		teclado.nextLine();
		
		if (modo == 1) {
			System.out.println("\nVoce escolheu jogar no modo 'A'");
			ModoA comp = new ModoA(simbolo, tab);
			return comp;
		} else if (modo == 2) {
			System.out.println("\nVoce escolheu jogar no modo 'B'");
			ModoB comp = new ModoB(simbolo, tab);
			return comp;
		} else {
			System.out.println("\nVoce escolheu jogar no modo 'C'");
			ModoC comp = new ModoC(simbolo, tab);
			return comp;
		}
	}

}
