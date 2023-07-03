package br.edu.insper.desagil.pf.qatar;

import java.util.HashMap;
import java.util.Map;

public class Selecao {
	
	private String sigla;
	private String nome;
	private Map<Integer, Jogador> jogadores;
	
	public Selecao(String sigla, String nome) {
		super();
		this.sigla = sigla;
		this.nome = nome;
		this.jogadores = new HashMap<>();
	}

	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}

	public Map<Integer, Jogador> getJogadores() {
		return jogadores;
	}
	
	public void convoca(int camisa, Jogador jogador) {
		jogadores.put(camisa, jogador);
	}
	
	public Ficha criaNovaFicha() {
		Ficha ficha = new Ficha(this);
		return ficha;
	}
}
