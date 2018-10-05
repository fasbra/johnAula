package validador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import exception.CampoObrigatorioException;
import exception.RegraNegocioException;
import model.impl.VendaIngresso;
import model.impl.ov.Periodo;
import validador.impl.ValidadorVendaIngresso;;

public class ValidadorVendaIngressoTest {

	LocalDate dataInicioEvento = LocalDate.now();
	LocalDate dataFimEvento = LocalDate.now().plusDays(1);
	Periodo periodoEvento = new Periodo(dataInicioEvento, dataFimEvento);

	private ValidadorVendaIngresso validador;

	@Before
	public void setUp() throws Exception {
		validador = new ValidadorVendaIngresso();

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
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEvento);
		try {
			validador.validaIngressoAdicionadoAVenda(vendaIngresso);
		} catch (Exception e) {
			assertEquals("Evento não possuí ingressos há venda.", e.getMessage());
		}
	}

	@Test
	public void deveInformarMensagemDaExceptionCorretamenteParaPeriodoInvalido() {
		LocalDate dataInicioEvento = LocalDate.now();
		LocalDate dataFimEvento = LocalDate.now().minusDays(1);
		Periodo periodoEvento = new Periodo(dataInicioEvento, dataFimEvento);

		VendaIngresso vendaIngresso = new VendaIngresso(periodoEvento);

		try {
			validador.validaPeriodoComDataInicialAnteriorADataFinal(vendaIngresso);
			fail("Deve apresentar exception");
		} catch (RegraNegocioException e) {
			assertEquals("A data de início de venda deve ser inferior a data de fim", e.getMessage());
		}
	}

	@Test
	public void deveValidarPeriodoSemGerarExecao() {
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEvento);

		try {
			validador.validaPeriodoComDataInicialAnteriorADataFinal(vendaIngresso);
		} catch (Exception e) {

		}
	}

	@Test
	public void deveValidarIngressosDaVendaSemGerarExcecao() {
		VendaIngresso vendaIngresso = new VendaIngresso(periodoEvento);

		try {
			validador.validaIngressosAVenda(vendaIngresso);
		} catch (Exception e) {

		}
	}
}
