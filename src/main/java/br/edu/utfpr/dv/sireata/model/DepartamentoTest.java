package br.edu.utfpr.dv.sireata.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DepartamentoTest {
	
	Campus cp;
	Departamento dp;
	int idDepartamento;

	@BeforeEach
	void setUp() throws Exception {
		cp = new Campus();
		dp = new Departamento();
		idDepartamento = 5;
		cp.setAtivo(true);
	}

	@Test
	void testGetIdDepartamento() {
		dp.setIdDepartamento(idDepartamento);
		assertEquals(idDepartamento, dp.getIdDepartamento());
		
	}

	@Test
	void testGetCampus() {
		dp.setCampus(cp);
		assertEquals(cp, dp.getCampus());
	}

}