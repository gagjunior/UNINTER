/**
 * Classe para criar um jogador do tipo 'Humano'.
 * Esta e uma classe filha de Jogador
 * 
 * @author Gilberto A. G. Junior
 * @ru 143586
 * @since 14/10/2021
 * */

package br.com.gagjunior.jv;

public class Humano extends Jogador {
	
	private String nome;

	Humano(String simbolo, Tabuleiro tab, String nome) {
		super(simbolo, tab);
		this.nome = nome;		
	}	
	
	//Sobrescreve metodo 'jogar' da classe pai 'Jogador'	
	@Override
	public boolean jogar(int posicao) {
		int indice = posicao - 1;		
		tab.campo[indice] = getSimbolo();		
		return true;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}	
	
}
