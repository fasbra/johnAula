package validador;

import org.junit.Before;
import org.junit.Test;

import validador.impl.ValidadorEvento;

public class ValidadorEventoTest {
	
	private ValidadorEvento validator;
	
	@Before
	public void setUp() throws Exception {
		validator = new ValidadorEvento();
	}
}
