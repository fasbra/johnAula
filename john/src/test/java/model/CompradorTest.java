package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompradorTest {

	@Test
	public void asseguraValorCorretoDescontoOuro() {
		assertEquals(new Double(0.75), Comprador.OURO.getDesconto().getPercentualDeDesconto());
	}
	
	@Test
	public void asseguraValorCorretoDescontoPrata() {
		assertEquals(new Double(0.60), Comprador.PRATA.getDesconto().getPercentualDeDesconto());
	}
	
	@Test
	public void asseguraValorCorretoDescontoEstudante() {
		assertEquals(new Double(0.50), Comprador.ESTUDANTE.getDesconto().getPercentualDeDesconto());
	}
	
	@Test
	public void asseguraValorCorretoDescontoIdoso() {
		assertEquals(new Double(0.50), Comprador.IDOSO.getDesconto().getPercentualDeDesconto());
	}
	
	@Test
	public void asseguraValorCorretoSemDeconto() {
		assertEquals(new Double(0), Comprador.SEM_DESCONTO.getDesconto().getPercentualDeDesconto());
	}
	
}
