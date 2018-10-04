package validador;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import exception.CampoObrigatorioException;
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
	}
	
	@Test
	public void deveValidarPeriodoSemGerarExecao() {
	
	}
	
	@Test
	public void deveValidarIngressosDaVendaSemGerarExcecao() {
		
	}
}
