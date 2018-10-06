package service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import dao.Dao;
import model.Ingresso;
import model.impl.Evento;
import model.impl.IngressoPlateia;
import model.impl.IngressoPlateiaVip;
import model.impl.IngressoVip;
import model.impl.VendaIngresso;
import model.impl.ov.Periodo;
import servico.impl.ServicoVendaIngresso;
import validador.Validador;

public class ServicoVendaIngressoTest {
	private Periodo periodo;
	private Evento evento;
	private List<Ingresso> ingressosParaVenda;
	
	private ServicoVendaIngresso servico;
	@Mock
	private Validador<VendaIngresso> validador;
	@Mock
	private Dao<VendaIngresso> dao;
	
	@Before
	public void setUp() throws Exception{
		initMocks(this);
		servico = new ServicoVendaIngresso(validador,dao);
		
		periodo = new Periodo(LocalDate.now(), LocalDate.now().plusDays(1));
		
		evento = new Evento("teste", LocalDate.now());
		
		ingressosParaVenda = new ArrayList<Ingresso>();
		ingressosParaVenda.add(new IngressoVip());
		ingressosParaVenda.add(new IngressoPlateia());
	}
	
	@Test
	public void asseguraAValidacaoESalvamentoQuandoCriarUmaVendaComTiposDeIngresso() {
	/*
		VendaIngresso venda = new VendaIngresso(periodo);
		
		//venda.informaEvento(evento);
		servico.create(venda, ingressosParaVenda);
		
		verify(validador, times(1)).valida(venda);
		verify(dao, times(1)).salvar(venda);
		
		assertEquals(venda.getIngressosDisponiveis().size() , ingressosParaVenda.size());
		*/
	}
	
	@Test
	public void asseguraAIncusaoDeNovosIngressosEValidaVenda() {
		/*
		VendaIngresso venda = new VendaIngresso(periodo);
		venda.informaEvento(evento);
		
		servico.create(venda, ingressosParaVenda);
		
		Ingresso ingresso = new IngressoPlateiaVip();
		servico.incluiIngresso(venda, ingresso);
		
		verify(validador,times(1)).valida(venda);
		assertTrue(venda.getIngressosDisponiveis().contains(ingresso));
		*/
	}
}
