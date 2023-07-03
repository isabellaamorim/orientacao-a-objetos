package br.edu.insper.desagil.pf.admin;

public class Morador {
	private String cpf;
	private String nome;

	public Morador(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
