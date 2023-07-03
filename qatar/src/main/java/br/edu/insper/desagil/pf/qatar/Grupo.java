package br.edu.insper.desagil.pf.qatar;

import java.util.List;

public class Grupo {

	private List<Selecao> selecoes;
	
	public Grupo(List<Selecao> selecoes) {
		super();
		this.selecoes = selecoes;
	}
	
	public Selecao primeiro() {
		Selecao primeiroColocado = selecoes.get(0);
		return primeiroColocado;
	}
	
	public Selecao segundo() {
		Selecao segundoColocado = selecoes.get(1);
		return segundoColocado;
	}
}
