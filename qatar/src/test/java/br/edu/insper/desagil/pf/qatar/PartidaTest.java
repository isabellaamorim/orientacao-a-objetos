package br.edu.insper.desagil.pf.qatar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PartidaTest {
	
	private Ficha fichaA;
	private Ficha fichaB;
	
	@BeforeEach
	private void setUp() {
		Selecao selecao1 = new Selecao("BR", "Brasil");
		fichaA = new Ficha(selecao1);
		
		Selecao selecao2 = new Selecao("AL", "Alemanha");
		fichaB = new Ficha(selecao2);
	}
	
	@Test
	void aVence() {
		fichaA.marca(10);
		Partida partida = new Partida(fichaA, fichaB);
		
		assertEquals(partida.vencedor().getNome(), fichaA.getSelecao().getNome());
	}
	
	@Test
	void bVence() {
		fichaB.marca(10);
		Partida partida = new Partida(fichaA, fichaB);
		
		assertEquals(partida.vencedor().getNome(), fichaB.getSelecao().getNome());
	}
	
	@Test
	void empata() {
		Partida partida = new Partida(fichaA, fichaB);
		assertEquals(partida.vencedor(), null);
	}
}
