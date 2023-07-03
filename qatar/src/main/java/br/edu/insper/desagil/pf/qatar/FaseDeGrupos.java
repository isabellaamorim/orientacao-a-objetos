package br.edu.insper.desagil.pf.qatar;

import java.util.ArrayList;
import java.util.List;

public class FaseDeGrupos extends Fase{

	private List<Grupo> grupos;
	
	public FaseDeGrupos(List<Grupo> grupos) {
		super();
		this.grupos = grupos;
	}
	
	@Override
	public Fase criaProximaFase() {
		
		List<Partida> partidas = new ArrayList<>();
		
		int n = grupos.size();
		
		for (int i = 0; i < grupos.size(); i++) {
		   
			Grupo grupo1 = grupos.get(i);
			Grupo grupo2 = grupos.get(n-(i+1));
			
			Selecao primeiraSelecao = grupo1.primeiro();
			Selecao segundaSelecao = grupo2.segundo();
			
			Partida partida = new Partida(primeiraSelecao.criaNovaFicha(), segundaSelecao.criaNovaFicha());
			
			partidas.add(partida);
		}
		
		FaseDeEliminacao proximaFase = new FaseDeEliminacao(partidas);
		return proximaFase;
	}
}
