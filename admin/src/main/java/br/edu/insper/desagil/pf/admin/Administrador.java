package br.edu.insper.desagil.pf.admin;

import java.time.ZonedDateTime;

public abstract class Administrador extends Morador {
	private ZonedDateTime inicioMandato;
	private ZonedDateTime fimMandato;

	public Administrador(String cpf, String nome, ZonedDateTime inicioMandato, ZonedDateTime fimMandato) {
		super(cpf, nome);
		this.inicioMandato = inicioMandato;
		this.fimMandato = fimMandato;
	}

	public ZonedDateTime getInicioMandato() {
		return inicioMandato;
	}

	public void setInicioMandato(ZonedDateTime inicioMandato) {
		this.inicioMandato = inicioMandato;
	}

	public ZonedDateTime getFimMandato() {
		return fimMandato;
	}

	public void setFimMandato(ZonedDateTime fimMandato) {
		this.fimMandato = fimMandato;
	}

	public abstract void avisa();
}
