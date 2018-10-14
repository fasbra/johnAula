package service;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import org.mockito.Mock;
import static org.mockito.BDDMockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

import dao.Dao;
import model.impl.Evento;
import servico.impl.ServicoEvento;
import validador.Validador;

public class ServicoEventoTest {

	private ServicoEvento servico;
	@Mock
	private Validador<Evento> validador;
	@Mock
	private Dao<Evento> dao;
	 
	@Before
	public void setUp() throws Exception{
		initMocks(this);
		servico = new ServicoEvento(validador,dao);
	}
	
	@Test
	public void AsseguraAValidacaoESalvamentoQuandoCriarUmEvento() {
		Evento evento = new Evento();
		
		servico.create(evento);
		
		verify(validador, times(1)).valida(evento);
		verify(dao, times(1)).salvar(evento);
	}
	
}
