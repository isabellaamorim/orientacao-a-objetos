package br.edu.insper.desagil.pf.qatar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ficha {

	private Selecao selecao;
	private List<Integer> camisasIniciais;
	private Map<Integer, Integer> substituicoes;
	private Map<Integer, Integer> gols;
	
	public Ficha(Selecao selecao) {
		super();
		this.selecao = selecao;
		this.camisasIniciais = null;
		this.substituicoes = new HashMap<>(); 
		this.gols = new HashMap<>();
	}

	public Selecao getSelecao() {
		return selecao;
	}

	public void setCamisasIniciais(List<Integer> camisasIniciais) {
		this.camisasIniciais = camisasIniciais;
	}
	
	public void substitui(int camisa1, int camisa2) {
		substituicoes.put(camisa1, camisa2);
	}

	public void marca(int camisa) {
		if(gols.containsKey(camisa)) {
			int saldoGol = gols.get(camisa);
			saldoGol += 1;
			gols.put(camisa, saldoGol);
		}
		else {
			gols.put(camisa, 1);
		}
	}
	
	public List<Integer> camisasFinais() {
		List<Integer> camisasFinais = new ArrayList<>();
	
		for (int camisa : camisasIniciais) {
		    
		    if(substituicoes.containsKey(camisa)) {
		    	int camisaSub = substituicoes.get(camisa);
		    	camisasFinais.add(camisaSub);
		    }
		    else {
		    	camisasFinais.add(camisa);
		    	}
			} 
		return camisasFinais;
		}
	
	public int totalGols() {
		
		int n = gols.size();
		int golsTotais = 0;
		
		if(n == 0) {
			return 0;
		}
		else {
			for (int camisa : gols.keySet()) {
			    int nGols = gols.get(camisa);
			    golsTotais += nGols;
			}
		}
		return golsTotais;
	}
	
}
