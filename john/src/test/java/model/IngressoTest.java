package model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.impl.IngressoBackStage;
import model.impl.IngressoPlateia;
import model.impl.IngressoPlateiaVip;
import model.impl.IngressoVip;
import model.impl.TipoIngresso;

public class IngressoTest {
	
	private Ingresso ingressoVip;
	private Ingresso ingressoBackStage;
	private Ingresso ingressoPlateiaVip;
	private Ingresso ingressoPlateia;
	
	@Before
	public void setUp() throws Exception {
		ingressoVip = new IngressoVip();
		ingressoBackStage = new IngressoBackStage();
		ingressoPlateiaVip = new IngressoPlateiaVip();
		ingressoPlateia = new IngressoPlateia();
	}
	
	@Test
	public void asseguraTipoCorretoIngressoVip() {
		
		assertEquals(TipoIngresso.VIP, ingressoVip.getTipoIngresso());
		
	}
	
	@Test
	public void asseguraValorCorretoIngressoVip() {
		
		assertEquals(1000, ingressoVip.getValor());
		
	}
	
	@Test
	public void asseguraTipoCorretoIngressoBackStage() {
		
		assertEquals(TipoIngresso.BACKSTAGE, ingressoBackStage.getTipoIngresso());
		
	}
	
	@Test
	public void asseguraValorCorretoIngressoBackStage() {
		
		assertEquals(800, ingressoBackStage.getValor());
		
	}
	
	@Test
	public void asseguraTipoCorretoIngressoPlateiaVip() {
		
		assertEquals(TipoIngresso.PLATEIA_VIP, ingressoPlateiaVip.getTipoIngresso());
		
	}
	
	@Test
	public void asseguraValorCorretoIngressoPlateiaVip() {
		
		assertEquals(500, ingressoPlateiaVip.getValor());
		
	}
	
	@Test
	public void asseguraTipoCorretoIngressoPlateia() {
		
		assertEquals(TipoIngresso.PLATEIA, ingressoPlateia.getTipoIngresso());
		
	}
	
	@Test
	public void asseguraValorCorretoIngressoPlateia() {
		
		assertEquals(300, ingressoPlateia.getValor());
		
	}
}
