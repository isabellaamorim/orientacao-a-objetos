package br.edu.insper.desagil.pf.admin;

import java.util.Map;

public class Predio {
	private int numero;
	private String nome;
	private Map<Integer, Unidade> unidades;
	private SubSindico subSindico;

	public Predio(int numero, String nome, Map<Integer, Unidade> unidades) {
		this.numero = numero;
		this.nome = nome;
		this.unidades = unidades;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public Map<Integer, Unidade> getUnidades() {
		return unidades;
	}

	public SubSindico getSubSindico() {
		return subSindico;
	}

	public void setSubSindico(SubSindico subSindico) {
		this.subSindico = subSindico;
	}
}
