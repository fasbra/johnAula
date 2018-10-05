package service;

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
import model.impl.IngressoPlateia;
import model.impl.IngressoPlateiaVip;
import model.impl.IngressoVip;
import model.impl.VendaIngresso;
import model.impl.ov.Periodo;
import servico.impl.ServicoVendaIngresso;
import validador.Validador;

public class ServicoVendaIngressoTest {
	private Periodo periodo;
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
		
		ingressosParaVenda = new ArrayList<Ingresso>();
		ingressosParaVenda.add(new IngressoVip());
		ingressosParaVenda.add(new IngressoPlateia());
	}
	
	@Test
	public void AsseguraAValidacaoESalvamentoQuandoCriarUmaVendaComTiposDeIngresso() {
		VendaIngresso venda = new VendaIngresso(periodo);
		
		servico.create(venda, ingressosParaVenda);
		
		verify(servico, times(1)).incluiVariosIngressos(venda, ingressosParaVenda);
		verify(validador, times(1)).valida(venda);
		verify(dao, times(1)).salvar(venda);
	}
	
	@Test
	public void AsseguraAIncusaoDeNovosIngressosEValidaVenda() {
		VendaIngresso venda = new VendaIngresso(periodo);
		
		servico.create(venda, ingressosParaVenda);
		Ingresso ingresso = new IngressoPlateiaVip();
		servico.incluiIngresso(venda, new IngressoPlateiaVip());
		
		verify(servico, times(1)).incluiIngresso(venda, ingresso);
		verify(validador, times(1)).valida(venda);
	}
}
