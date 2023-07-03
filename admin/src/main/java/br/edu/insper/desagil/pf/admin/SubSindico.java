package br.edu.insper.desagil.pf.admin;

import java.time.ZonedDateTime;

public class SubSindico extends Administrador {
	public SubSindico(String cpf, String nome, ZonedDateTime inicioMandato, ZonedDateTime fimMandato) {
		super(cpf, nome, inicioMandato, fimMandato);
	}

	@Override
	public void avisa() {
	}
}
