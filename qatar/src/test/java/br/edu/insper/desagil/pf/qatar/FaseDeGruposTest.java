package br.edu.insper.desagil.pf.qatar;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FaseDeGruposTest {
	
	@Test
	void criaProximaFase() {
		
		List<Selecao> selecoes1 = new ArrayList<>();
		Selecao selecaoA = new Selecao("BR", "Brasil");
		Selecao selecaoB = new Selecao("SV", "Sérvia");
		Selecao selecaoC = new Selecao("SU", "Suíça");
		Selecao selecaoD = new Selecao("CM", "Camarões");
		selecoes1.add(selecaoA);
		selecoes1.add(selecaoB);
		selecoes1.add(selecaoC);
		selecoes1.add(selecaoD);
		Grupo grupoA = new Grupo(selecoes1);
		
		List<Selecao> selecoes2 = new ArrayList<>();
		Selecao selecaoE = new Selecao("CN", "Canada");
		Selecao selecaoF = new Selecao("EU", "EUA");
		Selecao selecaoG = new Selecao("MX", "Mexico");
		Selecao selecaoH = new Selecao("GT", "Guatemala");
		selecoes2.add(selecaoE);
		selecoes2.add(selecaoF);
		selecoes2.add(selecaoG);
		selecoes2.add(selecaoH);
		Grupo grupoB = new Grupo(selecoes2);
		
		List<Selecao> selecoes3 = new ArrayList<>();
		Selecao selecaoI = new Selecao("AR", "Argentina");
		Selecao selecaoJ = new Selecao("CH", "Chile");
		Selecao selecaoK = new Selecao("UR", "Uruguai");
		Selecao selecaoL = new Selecao("PA", "Paraguai");
		selecoes3.add(selecaoI);
		selecoes3.add(selecaoJ);
		selecoes3.add(selecaoK);
		selecoes3.add(selecaoL);
		Grupo grupoC = new Grupo(selecoes3);
		
		List<Grupo> grupos = new ArrayList<>();
		grupos.add(grupoA);
		grupos.add(grupoB);
		grupos.add(grupoC);
		
		FaseDeGrupos fase = new FaseDeGrupos(grupos);
		
		fase.criaProximaFase();
		
	}

}
