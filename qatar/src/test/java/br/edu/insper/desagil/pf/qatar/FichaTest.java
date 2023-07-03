package br.edu.insper.desagil.pf.qatar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FichaTest {
	
	private Ficha ficha;
	
	@BeforeEach
	private void setUp() {
		Selecao selecao = new Selecao("BR", "Brasil");
		ficha = new Ficha(selecao);
	}
	
	@Test
	void naoSubstitui() {
		
		List<Integer> camisasIniciais = new ArrayList<>();
		camisasIniciais.add(1);
		camisasIniciais.add(2);
		camisasIniciais.add(3);
		
		ficha.setCamisasIniciais(camisasIniciais);
		
		List<Integer> camisasFinais = ficha.camisasFinais();
		
		assertEquals(camisasIniciais, camisasFinais);
	}
	
	@Test
	void substitui() {
		
		List<Integer> subsTeste = new ArrayList<>();
		subsTeste.add(4);
		subsTeste.add(5);
		subsTeste.add(6);
		
		List<Integer> camisasIniciais = new ArrayList<>();
		camisasIniciais.add(1);
		camisasIniciais.add(2);
		camisasIniciais.add(3);
		ficha.setCamisasIniciais(camisasIniciais);
		
		ficha.substitui(1, 4);
		ficha.substitui(2, 5);
		ficha.substitui(3, 6);
		
		List<Integer> camisasFinais = ficha.camisasFinais();
		
		assertEquals(subsTeste, camisasFinais);
	}
	
	@Test
	void marcaZero() {
		assertEquals(0, ficha.totalGols());
	}
	
	@Test
	void marcaUm() {
		ficha.marca(10);
		assertEquals(1, ficha.totalGols());
	}
	
	@Test
	void marcaDois() {
		ficha.marca(10);
		ficha.marca(10);
		
		assertEquals(2, ficha.totalGols());
	}
	
	@Test
	void marcaTres() {
		ficha.marca(1);
		ficha.marca(10);
		ficha.marca(10);
		
		assertEquals(3, ficha.totalGols());
	}
}
