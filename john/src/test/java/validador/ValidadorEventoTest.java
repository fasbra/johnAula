package validador;

import org.junit.Before;
import org.junit.Test;

import exception.CampoObrigatorioException;
import model.impl.Evento;
import validador.impl.ValidadorEvento;

public class ValidadorEventoTest {
	
	private ValidadorEvento validador;
	
	@Before
	public void setUp() throws Exception {
		validador = new ValidadorEvento();
	}
	
	@Test(expected = CampoObrigatorioException.class)
	public void DeveGerarCampoObrigatorioExceptionQuandoNomeForNula() {
		Evento evento = new Evento();
		
		validador.validaNomeObrigatorio(evento);		
	}
	
	@Test(expected = CampoObrigatorioException.class)
	public void DeveGerarCampoObrigatorioExceptionQuandoNomeForBranco() {
		Evento evento = new Evento("", null);
		
		validador.validaNomeObrigatorio(evento);		
	}
	
	@Test(expected = CampoObrigatorioException.class)
	public void DeveGerarCampoObrigatorioExceptionQuandoDataForNula() {
		Evento evento = new Evento("", null);
		
		validador.validaDataObrigatoria(evento);		
	}
	
}
