package validador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.LocalDate;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;

import exception.CampoObrigatorioException;
import exception.RegraNegocioException;
import model.impl.Evento;
import validador.impl.ValidadorEvento;

public class ValidadorEventoTest {
	
	private ValidadorEvento validador;
	
	@Before
	public void setUp() throws Exception {
		validador = new ValidadorEvento();
	}
	
	@Test(expected = CampoObrigatorioException.class)
	public void deveGerarCampoObrigatorioExceptionQuandoNomeForNula() {
		LocalDate hoje = LocalDate.now();
		Evento evento = new Evento(null,hoje);
		
		validador.validaNomeObrigatorio(evento);		
	}
	
	@Test(expected = CampoObrigatorioException.class)
	public void deveGerarCampoObrigatorioExceptionQuandoNomeForBranco() {
		Evento evento = new Evento("", null);
		
		validador.validaNomeObrigatorio(evento);		
	}
	
	@Test(expected = CampoObrigatorioException.class)
	public void deveGerarCampoObrigatorioExceptionQuandoDataForNula() {
		Evento evento = new Evento();
		
		validador.validaDataObrigatoria(evento);		
	}
	
	@Test
	public void deveValidarNomeSemGerarExecao() {
		Evento evento = new Evento("Teste", null);
		
		validador.validaNomeObrigatorio(evento);
	}
	
	@Test
	public void deveInformarMensagemDaExeceptionCorretamentaParaNomeComCaracteresAlemDoMaximoPermitido() {
		Evento evento = new Evento(RandomStringUtils.random(151), null);
		
		try{
			validador.validaTamanhoMaximoNome(evento);
			fail("Deve apresentar exception");
		}catch (RegraNegocioException e) {
			assertEquals("O campo Nome tem um tamanho de no maximo 150 caracteres", e.getMessage());
		}
	}
	
	@Test
	public void deveGerarExcecaoQuandoDataDoEventoMenorQueDataAtual() {
		LocalDate ontem = LocalDate.now().minusDays(1);
		Evento evento = new Evento("teste", ontem);
		
		try {
			validador.validaDataMaiorQueDataAtual(evento);
			fail("Deve apresentar exception");
		} catch (RegraNegocioException e) {
			assertEquals("A data deve ser maior ou igual a data atual", e.getMessage());
		}
	}
	
	@Test
	public void deveValidarDataAtualSemGerarExcecao() {
		LocalDate hoje = LocalDate.now();
		Evento evento = new Evento("teste", hoje);
		
		validador.validaDataMaiorQueDataAtual(evento);
	}
	
	@Test
	public void deveValidarDataFuturaSemGerarExcecao() {
		LocalDate amanha = LocalDate.now().plusDays(1);
		Evento evento = new Evento("teste", amanha);
		
		validador.validaDataMaiorQueDataAtual(evento);
	}
	
}
