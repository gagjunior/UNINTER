/**
 * Classe pai 'Jogador'
 * Esta classe nao e instanciada por isso e abstrata
 * Classe base para jogador do tipo 'Humano' ou 'Computador'
 * 
 * @author Gilberto A. G. Junior
 * @ru 143586
 * @since 14/10/2021
 **/

package br.com.gagjunior.jv;

public abstract class Jogador {
	
	private String simbolo;
	private int vitorias;
	private int empates;
	Tabuleiro tab;
	
	Jogador (String simbolo, Tabuleiro tab) {
		this.simbolo = simbolo;
		this.tab = tab;
	}
	
	// Metodo jogar sem parametros. Utilizado pelo computador
	boolean jogar() {
		return true;
	}
	
	// Metodo jogar que recebe a posicao como parametro
	// Utilizado pelo jogador humano
	boolean jogar(int posicao) {
		return true;
	}
	
	// Metodo para verificar se a posicao indicada pelo jogador esta livre
	boolean posicaoEhLivre(int indice) {
		return tab.campo[indice].equals("-") ? true : false;
	}
	
	// Metodo para verificar se o simbolo na posicao e igual
	boolean posicaoEhIgual(int indice, String simbolo) {		
		return tab.campo[indice].equals(simbolo) ? true : false;
	}
	
	// Metodo para registrar a jogada
	void registraPosicao(int indice, String simbolo) {
		tab.campo[indice] = simbolo;		
	}
		
	
	// Getters e Setters
	public String getSimbolo() {
		return simbolo;
	}
	
	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;		
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
