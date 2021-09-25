package br.com.gagjunior.jv;

import java.util.Scanner;

//Classe principal
public class Jogo {

	public static void main(String[] args) {
		
		String nomeJogador;
		int modoJogo;
		int opcaoSimbolo;
		String simboloHum;
		String simboloComp;
		Tabuleiro tab = new Tabuleiro();
		
		//Titulo do jogo
		exibirTitulo();		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nomeJogador = teclado.nextLine();
		
		System.out.println(nomeJogador + ", Seja bem vindo ao jogo da velha!!\n");
		
		System.out.println("Escolha com qual simbolo você quer jogar...");
		System.out.println("1 - X");
		System.out.println("2 - O");
		System.out.print("Digite o numero do simbolo: \n");
		
		opcaoSimbolo = teclado.nextInt();
		teclado.nextLine();
		
		simboloHum = opcaoSimbolo == 1 ? "X" : "O";
		simboloComp = simboloHum.equals("X") ? "O" : "X";
		
		System.out.println("Você vai jogar com o simbolo: " + simboloHum + "\n");
		
		System.out.println("***Modos de Jogo***");
		System.out.println("1 - Modo A");
		System.out.println("2 - Modo B");
		System.out.println("3 - Modo C");
		System.out.print("Digite o numero do modo que deseja jogar: ");
		
		modoJogo = teclado.nextInt();
		teclado.nextLine();		
		
		
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
