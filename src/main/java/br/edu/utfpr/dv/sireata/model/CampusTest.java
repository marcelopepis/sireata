package br.edu.utfpr.dv.sireata.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampusTest {

	Campus cp;
	int idCampus;
	String nome;
	String endereco;
	byte[] logo;
	boolean ativo;
	String site;
	
	@BeforeEach
	void setUp() throws Exception {
		cp = new Campus();
		idCampus = 4;
		nome = "Cornélio Procópio";
		endereco = "Av. Alberto Carazzai, 1640 - Vila Seugling, Cornélio Procópio";
		logo = null;
		ativo = true;
		site = "http://www.utfpr.edu.br/campus/cornelioprocopio";
	}

	@Test
	void testGetIdCampus() {
		cp.setIdCampus(idCampus);
		assertEquals(idCampus, cp.getIdCampus());
	}

	@Test
	void testGetNome() {
		cp.setNome(nome);
		assertEquals(nome, cp.getNome());
	}

	@Test
	void testGetEndereco() {
		cp.setEndereco(endereco);
		assertEquals(endereco, cp.getEndereco());
	}

	@Test
	void testGetLogo() {
		cp.setLogo(logo);
		assertArrayEquals(logo, cp.getLogo());
	}

	@Test
	void testIsAtivo() {
		cp.setAtivo(ativo);
		assertTrue(cp.isAtivo() == true);
	}

	@Test
	void testGetSite() {
		cp.setSite(site);
		assertEquals(site, cp.getSite());
	}

}