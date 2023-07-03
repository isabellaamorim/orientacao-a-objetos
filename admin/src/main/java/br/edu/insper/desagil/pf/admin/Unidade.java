package br.edu.insper.desagil.pf.admin;

import java.util.List;

public class Unidade {
	private List<Morador> moradores;

	public Unidade(List<Morador> moradores) {
		this.moradores = moradores;
	}

	public List<Morador> getMoradores() {
		return moradores;
	}

	public void adicionaMorador(Morador morador) {
		moradores.add(morador);
	}
}
