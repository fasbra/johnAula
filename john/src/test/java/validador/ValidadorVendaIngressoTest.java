package validador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import exception.CampoObrigatorioException;
import exception.RegraNegocioException;
import model.Ingresso;
import model.impl.IngressoPlateia;
import model.impl.IngressoVip;
import model.impl.VendaIngresso;
import model.impl.ov.Periodo;
import validador.impl.ValidadorVendaIngresso;;

public class ValidadorVendaIngressoTest {

	private Periodo periodoEventoValido;
	private Periodo periodoEventoInvalido;
	private Ingresso ingressoVip1;
	private Ingresso ingressoVip2;
	private Ingresso ingressoPlateia;	

	private ValidadorVendaIngresso validador;

	@Before
	public void setUp() throws Exception {
		validador = new ValidadorVendaIngresso();
		
		LocalDate dataInicioEvento = LocalDate.now();
		LocalDate dataFuturaFimEvento = LocalDate.now().plusDays(1);
		LocalDate dataPassadaFimEvento = LocalDate.now().minusDays(1);
		
		periodoEventoValido = new Periodo(dataInicioEvento, dataFuturaFimEvento);
		periodoEventoInvalido = new Periodo(dataInicioEvento, dataPassadaFimEvento);
		
		ingressoVip1 = new IngressoVip();
		ingressoVip2 = new IngressoVip();
		ingressoPlateia = new IngressoPlateia();
	}

	@Test(expected = CampoObrigatorioException.class)
	public void deveGerarCampoObrigatorioExceptionQuandoPeriodoNulo() {
		VendaIngresso vendaIngresso = new VendaIngresso(null);
		validador.validaPeriodoObrigatorio(vendaIngresso);
	}

	@Test(expected = CampoObrigatorioException.class)
	public void deveGerarCampoObrigatorioExceptionQuandoEventoForNulo() {
		VendaIngresso vendaIngresso = new VendaIngresso(null);
		validador.validaEventoObrigatorio(vendaIngresso);
	}

	@Test(expected = CampoObrigatorioException.class)
	public void deveGerarCampoObrigatorioExceptionQuandoNaoExistirIngressosVinculadosAVenda() {
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEventoValido);
		validador.validaIngressoAdicionadosAVenda(vendaIngresso);
	}

	@Test
	public void deveInformarMEnsagemDaExceptionParaVendaSemIngressos() {
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEventoValido);
		
		try {
			validador.validaIngressoAdicionadosAVenda(vendaIngresso);
		} catch (Exception e) {
			assertEquals("Evento não possuí ingressos há venda.", e.getMessage());
		}
	}

	@Test
	public void deveInformarMensagemDaExceptionCorretamenteParaPeriodoInvalido() {
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEventoInvalido);

		try {
			validador.validaPeriodoComDataInicialAnteriorADataFinal(vendaIngresso);
			fail("Deve apresentar exception");
		} catch (RegraNegocioException e) {
			assertEquals("A data de início de venda deve ser inferior a data de fim", e.getMessage());
		}
	}
	
	@Test
	public void deveInformarMensagemDaExceptionCorretamenteParaVendaComIngressosDuplicados() {
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEventoValido);
		vendaIngresso.adicionaIngressoParaVenda(ingressoVip1);
		vendaIngresso.adicionaIngressoParaVenda(ingressoVip2);
		
		try {
			validador.validaIngressosAVendaSemDuplicidades(vendaIngresso);
			fail("Deve apresentar exception");
		} catch (RegraNegocioException e) {
			assertEquals("Venda com ingressos duplicados.", e.getMessage());
		}
	}

	@Test
	public void deveValidarPeriodoSemGerarExecao() {
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEventoValido);
		validador.validaPeriodoComDataInicialAnteriorADataFinal(vendaIngresso);
	}

	@Test
	public void deveValidarIngressosDaVendaSemGerarExcecao() {
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEventoValido);
		vendaIngresso.adicionaIngressoParaVenda(ingressoVip1);
		vendaIngresso.adicionaIngressoParaVenda(ingressoPlateia);

		validador.validaIngressosAVendaSemDuplicidades(vendaIngresso);
		validador.validaIngressoAdicionadosAVenda(vendaIngresso);
	}
}
