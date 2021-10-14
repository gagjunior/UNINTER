/**
 * Classe abstrata para interação com o jogador humano
 * Exibe a maior parte das mensagens na tela para o jogador
 * @author Gilberto A. G. Junior
 * @ru 143586
 * @since 14/10/2021
 * */

package br.com.gagjunior.jv;

public abstract class Interface {

	// Mensagem de boas vindas
	static void msgBoasVindas(Humano humano) {
		System.out.println(humano.getNome() + ",  bem vindo ao Jogo da Velha");
		System.out.println("Voce vai jogar com o simbolo: " + humano.getSimbolo());
		System.out.println();
	}

	// Exibir titulo do jogo
	static void exibirTitulo() {
		System.out.println("XOXOXOXOXOXOXOXOXOXOXOXOXOXOX");
		System.out.println("X      JOGO DA VELHA        O");
		System.out.println("XOXOXOXOXOXOXOXOXOXOXOXOXOXOX");
		System.out.println();
	}

	// Solicitar simbolo ao jogador
	static void solicitaSimbolo() {
		System.out.println("****Simbolos****");
		System.out.println("1 - X");
		System.out.println("2 - O");
		System.out.println("****************\n");
		System.out.println("Escolha com qual simbolo voce quer jogar.");
		System.out.print("Digite o numero 1 ou 2: ");
	}

	// Pergunta se deseja iniciar a partida
	static void msgIniciar() {
		System.out.println("Deseja iniciar a partida?");
		System.out.print("Digite S - sim / N - nao: ");
	}

	// Pergunta se deseja continuar jogando
	static void msgContinuarJogo() {
		System.out.println("Deseja continuar jogando?");
		System.out.print("Digite S - sim / N - nao: ");
	}

	// Solicitar modo de jogo
	static void msgModoJogo() {
		System.out.println("***Modos de Jogo***");
		System.out.println("1 - Modo A");
		System.out.println("2 - Modo B");
		System.out.println("3 - Modo C");
		System.out.println("*******************\n");
		System.out.print("Digite o numero do modo que deseja jogar: ");
	}
	
	static void solicitarPosicao() {
		System.out.print("Digite o numero da posicao: ");
	}

}
