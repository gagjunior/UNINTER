package br.com.gagjunior.jv;

import java.util.Scanner;

//Classe principal
public class Jogo {

	public static void main(String[] args) {
		
		//Titulo do jogo
		exibirTitulo();
		
		String nomeJogador;
		int modoJogo;
		int opcaoSimbolo;
		char simbolo;
		Computador computador;
		
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
		
		if (opcaoSimbolo == 1) {
			System.out.println("Você vai jogar com 'X'");
			simbolo = Character.toUpperCase('X');
		} else {
			System.out.println("Você vai jogar com 'O'");
			simbolo = Character.toUpperCase('O');
		}
		
		
		System.out.println("***Modos de Jogo***");
		System.out.println("1 - Modo A");
		System.out.println("2 - Modo B");
		System.out.println("3 - Modo C");
		System.out.print("Digite o numero do mode que deseja jogar: ");
		
		modoJogo = teclado.nextInt();
		teclado.nextLine();

		if (modoJogo == 1) {
			System.out.println("Você escolheu o modo 'A'\n");
			computador = new ModoA(simbolo);
		} else if (modoJogo == 2) {
			System.out.println("Você escolheu o modo 'B'\n");
			computador = new ModoB(simbolo);
		} else {
			System.out.println("Você escolheu o modo 'C'\n");
			computador = new ModoC(simbolo);
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
