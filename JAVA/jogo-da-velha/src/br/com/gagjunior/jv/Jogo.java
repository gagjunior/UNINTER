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
		exibirTitulo();		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nomeJogador = teclado.nextLine();
		
		System.out.println();
		
		System.out.println("*** Simbolos ***");
		System.out.println("1 - X");
		System.out.println("2 - O");
		System.out.println("Escolha com qual simbolo você quer jogar.");
		System.out.print("Digite o numero 1 ou 2: ");
		
		opcaoSimbolo = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println();
		
		simboloHum = opcaoSimbolo == 1 ? "X" : "O";
		simboloComp = simboloHum.equals("X") ? "O" : "X";
		
		Humano humano = new Humano(simboloHum, tab, nomeJogador);
		
		System.out.println(humano.getNome() + ",  bem vindo ao Jogo da Velha");
		System.out.println("Você vai jogar com o simbolo: " + humano.getSimbolo());
		
		System.out.println();
	
		Computador maquina = setModoJogo(modoJogo, comp, simboloComp, teclado, tab);
		
		System.out.println();
		
		System.out.println("Deseja iniciar a partida?");
		System.out.print("Digite S - sim / N - não: ");
				
		inicio = teclado.nextLine().toUpperCase().charAt(0);
		
		while (inicio == 'S') {
			tab.imprimirPosicoes();
			
			System.out.println();
			
			inicio = 'N';
		}
		
		if (inicio == 'N') {
			System.out.println("\nQue pena...");
			System.out.println("Encerrando o jogo...");
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
	
	// Setar o modo de jogo
	static Computador setModoJogo (int modo, Computador comp, String simbolo, Scanner teclado, Tabuleiro tab) {
		System.out.println("***Modos de Jogo***");
		System.out.println("1 - Modo A");
		System.out.println("2 - Modo B");
		System.out.println("3 - Modo C");
		System.out.print("Digite o numero do modo que deseja jogar: ");
		
		modo = teclado.nextInt();		
		teclado.nextLine();
		
		if (modo == 1) {
			comp = new ModoA(simbolo, tab);
			System.out.println("\nVocê escolheu jogar no modo 'A'");
		} else if (modo == 2) {
			comp = new ModoB(simbolo, tab);			
			System.out.println("\nVocê escolheu jogar no modo 'B'");
		} else {
			comp = new ModoC(simbolo, tab);
			System.out.println("\nVocê escolheu jogar no modo 'C'");
		}
		return comp;
	}

}
