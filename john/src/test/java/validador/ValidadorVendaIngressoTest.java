package validador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import exception.CampoObrigatorioException;
import exception.RegraNegocioException;
import model.impl.Evento;
import model.impl.VendaIngresso;
import validador.impl.ValidadorVendaIngresso;;

public class ValidadorVendaIngressoTest {
	
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
		VendaIngresso vendaIngresso = new VendaIngresso(null);
		validador.validaIngressoAdicionadoAVenda(vendaIngresso);
	}
	
	@Test
	public void deveInformarMensagemDaExceptionCorretamenteParaPeriodoInvalido() {
		VendaIngresso vendaIngresso = new VendaIngresso(null);
		
		try {
			validador.validaPeriodoComDataInicialMenorQueDataFinal(vendaIngresso);
			fail("Deve apresentar exception");
		}catch (RegraNegocioException e) {
			assertEquals("A data de início de venda deve ser inferior a data de fim", e.getMessage());
		}
	}
	
	@Test
	public void deveValidarPeriodoSemGerarExecao() {
		VendaIngresso vendaIngresso = new VendaIngresso(null);
		validador.validaPeriodoComDataInicialMenorQueDataFinal(vendaIngresso);
	}
	
	@Test
	public void deveValidarIngressosDaVendaSemGerarExcecao() {
		VendaIngresso vendaIngresso = new VendaIngresso(null);
		validador.validaIngressosAVenda(vendaIngresso);
	}
}
