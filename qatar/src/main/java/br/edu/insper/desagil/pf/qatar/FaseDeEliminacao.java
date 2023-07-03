package br.edu.insper.desagil.pf.qatar;

import java.util.ArrayList;
import java.util.List;

public class FaseDeEliminacao extends Fase{

	private List<Partida> partidas;
	
	public FaseDeEliminacao(List<Partida> partidas) {
		super();
		this.partidas = partidas;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}
	
	@Override
	public Fase criaProximaFase() {
		
		List<Partida> partidas = new ArrayList<>();
		
		int n = partidas.size();
		
		if(n%2 != 0) {
			throw new IllegalStateException("Não é possível criar próxima fase!");
		}
		
		for (int i = 0; i < n/2; i+= 2) {
		   
			Partida partida1 = partidas.get(i);
			Partida partida2 = partidas.get(i+1);
			
			Selecao primeiraSelecao = partida1.vencedor();
			Selecao segundaSelecao = partida2.vencedor();
			
			Partida partida = new Partida(primeiraSelecao.criaNovaFicha(), segundaSelecao.criaNovaFicha());
			
			partidas.add(partida);
		}
		
		FaseDeEliminacao proximaFase = new FaseDeEliminacao(partidas);
		return proximaFase;
	}
	

}
