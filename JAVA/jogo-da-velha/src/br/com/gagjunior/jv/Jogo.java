package br.com.gagjunior.jv;

import java.util.Scanner;

import com.sun.source.tree.WhileLoopTree;

//Classe principal
public class Jogo {

	static String nomeJogador;
	static String modoJogo;
	static String opcaoSimbolo;
	static String inicio;
	static String simboloHum;
	static String simboloComp;
	static Tabuleiro tab = new Tabuleiro();
	static int partidas;
	static int jogadas;

	public static void main(String[] args) {

		// Titulo do jogo
		Interface.exibirTitulo();

		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite seu nome: ");
		nomeJogador = teclado.nextLine();

		System.out.println();

		// Escolhe simbolo
		opcaoSimbolo = "";
		
		while (opcaoSimbolo.equals("")) {
			Interface.solicitaSimbolo();			
			opcaoSimbolo = teclado.nextLine();
			
			if (opcaoSimbolo.equals("1") || opcaoSimbolo.equals("2")) {
				simboloHum = opcaoSimbolo.equals("1") ? "X" : "O";
				simboloComp = simboloHum.equals("X") ? "O" : "X";					
			} else {
				System.out.println("\nVoce nao digitou uma opcao valida\n");
				opcaoSimbolo = "";
			}			
		}

		Humano humano = new Humano(simboloHum, tab, nomeJogador);
		
		System.out.println();

		// Mensagem de boas vindas
		Interface.msgBoasVindas(humano);

		Computador maquina = setModoJogo(simboloComp, teclado, tab);

		System.out.println();

		// Iniciar partida?
		inicio = "";
		
		while (inicio.equals("")) {
			Interface.msgIniciar();
			inicio = teclado.nextLine();
			
			if (inicio.toUpperCase().equals("S") || inicio.toUpperCase().equals("N")) {
				inicio = inicio.toUpperCase();
			} else {
				inicio = "";
			}			
		}

		while (inicio.equals("S")) {
			String ganhador = "";
			jogadas = 0;
			tab.setJogadas(jogadas);

			tab.limpaTabuleiro();
			System.out.println();

			tab.imprimirTabuleiro();
			System.out.println();

			while (jogadas <= 9 && ganhador.equals("")) {
				
				String posicao = "";
				
				while (posicao.equals("")) {
					Interface.solicitarPosicao();
					posicao = teclado.nextLine();
					
					if (!posicao.matches("[1-9]")) {
						System.out.println("\nPosicao invalida. Digite um numero entre 1 e 9");
						posicao = "";
					}
					
				}				
				

				if (ganhador.equals("")) {
					humano.jogar(Integer.valueOf(posicao));
					jogadas++;
					ganhador = tab.simboloGanhador(jogadas);
				}

				if (ganhador.equals("")) {
					maquina.jogar();
					jogadas++;
					ganhador = tab.simboloGanhador(jogadas);
				}

				System.out.println();
				tab.imprimirTabuleiro();
				System.out.println();

				tab.setJogadas(jogadas);
			}

			partidas++;

			if (ganhador.equals("")) {
				int empate = humano.getEmpates();
				humano.setEmpates(empate + 1);
				System.out.println("Nao foi dessa vez... voce empatou!");
			} else if (humano.getSimbolo().equals(ganhador)) {
				int vitorias = humano.getVitorias();
				humano.setVitorias(vitorias + 1);
				System.out.println("Parabens " + humano.getNome() + "! Voce venceu!");
			} else if (maquina.getSimbolo().equals(ganhador)) {
				int vitorias = maquina.getVitorias();
				maquina.setVitorias(vitorias + 1);
				System.out.println("Que pena, voce perdeu... Mais sorte na proxima!");
			}

			System.out.println();

			Interface.msgContinuarJogo();
			inicio = teclado.nextLine().toUpperCase();
		}

		tab.setPartidas(partidas);

		if (inicio == "N") {
			float aproveitamento = ((float) humano.getVitorias() / (float) tab.getPartidas()) * 100;
			System.out.println("\nQue pena...\n");
			System.out.println("**** Estatisticas ****");
			System.out.println("Partidas: " + tab.getPartidas());
			System.out.println("Vitorias: " + humano.getVitorias());
			System.out.println("Derrotas: " + maquina.getVitorias());
			System.out.println("Empates: " + humano.getEmpates());
			System.out.printf("Aproveitamento: %.0f%%", aproveitamento);
			System.out.println("\n\nEncerrando o jogo...");
		}

		teclado.close();

	}

	// Setar o modo de jogo
	static Computador setModoJogo(String simbolo, Scanner teclado, Tabuleiro tab) {
		String modoJogo = "";
		
		while (modoJogo.equals("")) {
			
			Interface.msgModoJogo();
			modoJogo = teclado.nextLine();
			
			if (modoJogo.equals("1") || modoJogo.equals("2") || modoJogo.equals("3")) {
				
				if (modoJogo.equals("1")) {
					System.out.println("\nVoce escolheu jogar no modo 'A'");
					ModoA comp = new ModoA(simbolo, tab);
					return comp;
				} else if (modoJogo.equals("2")) {
					System.out.println("\nVoce escolheu jogar no modo 'B'");
					ModoB comp = new ModoB(simbolo, tab);
					return comp;
				} else {
					System.out.println("\nVoce escolheu jogar no modo 'C'");
					ModoC comp = new ModoC(simbolo, tab);
					return comp;
				}
				
			} else {
				System.out.println("\nValor invalido. Digite um numero entre 1 e 3\n");
				modoJogo = "";
			}		
			
		}
		
		return null;

	}

}
