package service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

import model.Comprador;
import model.Ingresso;
import model.impl.ingressos.IngressoPlateiaVip;
import servico.impl.EstrategiaDescontoPadrao;

public class EstrategiaDescontoPadraoTest {

	private EstrategiaDescontoPadrao estrategia;
	@Mock
	private Ingresso ingresso;
	private Comprador comprador;
	
	@Before	
	public void setUp() throws Exception {
		comprador = Comprador.ESTUDANTE;
		ingresso = new IngressoPlateiaVip();
		estrategia = new EstrategiaDescontoPadrao(ingresso, comprador);
	}
	
	@Test
	public void asseguraValorCorretoDesconto() {
		
		Double desconto = comprador.getDesconto().getPercentualDeDesconto();
		int valorIngresso = ingresso.getValor();
		Double valorDescontoCalculadoManualmente = valorIngresso * desconto;
		Double valorFinalIngresso = valorIngresso - valorDescontoCalculadoManualmente;
		assertEquals(valorFinalIngresso, estrategia.calcula());
			
	}
	
}
