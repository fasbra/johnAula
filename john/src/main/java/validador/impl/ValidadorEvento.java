package validador.impl;

import exception.campoObrigatorioException;
//import org.apache.commons.lang3.StringUtils;
import model.impl.Evento;
import validador.Validador;

public class ValidadorEvento implements Validador<Evento> {

	public void valida(Evento object) {
				
	}
	
	private void validaNomeObrigatorio(Evento evento) {
		String nome = evento.getNome();
		
		if(nome == null || nome == ""){
			throw new campoObrigatorioException("Erro"); //TODO adicionar erro corretamente
		}
	}

}
