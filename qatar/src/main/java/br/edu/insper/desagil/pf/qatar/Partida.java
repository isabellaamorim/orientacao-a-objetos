package br.edu.insper.desagil.pf.qatar;

public class Partida {

	private Ficha a;
	private Ficha b;
	
	public Partida(Ficha a, Ficha b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Ficha getA() {
		return a;
	}

	public Ficha getB() {
		return b;
	}
	
	public Selecao vencedor() {
		Selecao vencedor = null;
		
		int golsA = a.totalGols();
		int golsB = b.totalGols();
		
		if(golsA == golsB) {
			return null;
		}
		
		else {
			if(golsA > golsB) {
				vencedor = a.getSelecao();
			}
			else {
				vencedor = b.getSelecao();
			}
		}
		
		return vencedor;
	}
}
