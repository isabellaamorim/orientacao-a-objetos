package br.edu.insper.desagil.pf.qatar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class SelecaoTest {

	@Test
	void convoca() {
		
		Map<Integer, Jogador> jogadoresTeste = new HashMap<>();
		
		Selecao selecao = new Selecao("BR", "Brasil");
		
		Jogador jogador1 = new Jogador(0, "Neymar");
		Jogador jogador2 = new Jogador(1, "Richarlisson");
		Jogador jogador3 = new Jogador(2, "Paquetá");
		
		selecao.convoca(10, jogador1);
		selecao.convoca(11, jogador2);
		selecao.convoca(12, jogador3);
		
		jogadoresTeste.put(10, jogador1);
		jogadoresTeste.put(11, jogador2);
		jogadoresTeste.put(12, jogador3);
		
		assertEquals(jogadoresTeste, selecao.getJogadores());
	}
}
