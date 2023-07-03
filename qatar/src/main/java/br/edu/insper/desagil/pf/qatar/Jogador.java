package br.edu.insper.desagil.pf.qatar;

public class Jogador {

	private int id; 
	private String nome;
	
	public Jogador(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
}
