package model;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import model.Cliente;

public class TestCliente {

	Cliente pauloCezar = new Cliente("Paulo Cezar", "332.432.547-98", "emaildopaulo@gmail.com", null);
	Cliente brunoDeLucca = new Cliente("Bruno de Lucca", "136.772.098-71", "luquita@gmail.com", null);
	
	@Test
	public void validaNome() {
		assertEquals(pauloCezar.getNome(), "Paulo Cezar");
	}

	@Test
	public void validaCPF() {
		assertEquals(pauloCezar.getCpf(), "332.432.547-98");
		
	}
	
	@Test
	public void validaEmail() {
		assertEquals(pauloCezar.getEmail(), "emaildopaulo@gmail.com");
		
	}
	
	@Test
	public void validaDataDeNascimento() {
		assertEquals(pauloCezar.getDataNascimento(), null);
	}
}
