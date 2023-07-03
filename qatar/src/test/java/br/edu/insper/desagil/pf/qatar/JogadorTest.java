package br.edu.insper.desagil.pf.qatar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JogadorTest {
	
	@Test
	void constroi(){
		Jogador jogador = new Jogador(10, "Neymar");
		assertEquals(10, jogador.getId());
		assertEquals("Neymar", jogador.getNome());
	}
}
