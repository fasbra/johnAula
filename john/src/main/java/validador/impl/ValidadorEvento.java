package validador.impl;

import exception.campoObrigatorioException;
import exception.regraNegocioException;

import java.time.LocalDate;

import org.apache.commons.lang3.StringUtils;
import model.impl.Evento;
import validador.Validador;

public class ValidadorEvento implements Validador {

	private Evento _evento;
	
	public ValidadorEvento(Evento evento) {
		this._evento = evento;
	}
	
	private static final String MENSAGEM_CAMPO_NOME_OBRIGATORIO = "Campo Nome do Evento não informado"; 
	private static final String MENSAGEM_CAMPO_NOME_TAMANHO_MAXIMO = "O campo Nome tem um tamanho de no máximo 150 caracteres"	;
	
	private static final String MENSAGEM_CAMPO_DATA_OBRIGATORIO = "Camo Data do Evento não informado";
	private static final String MENSAGEM_CAMPO_DATA_MENOR_QUE_HOJE = "A data deve ser maior ou igual a data atual";
	
	private static final int TAMANHO_MAXIMO_CAMPO_NOME = 150;
	private static final LocalDate HOJE = LocalDate.now();
	
	public void valida() {
		validaNomeObrigatorio();
		validaDataObrigatoria();
	}
	
	private void validaNomeObrigatorio() {
		if(StringUtils.isEmpty(_evento.getNome())){
			throw new campoObrigatorioException(MENSAGEM_CAMPO_NOME_OBRIGATORIO);
		}		
	}
	
	private void validaDataObrigatoria() {		
		if(_evento.getDataEvento() == null){
			throw new campoObrigatorioException(MENSAGEM_CAMPO_DATA_OBRIGATORIO);
		}		
	}
	
	private void validaTamanhoMaximoNome() {
		if(_evento.getNome().length() > TAMANHO_MAXIMO_CAMPO_NOME ) {
			throw new regraNegocioException(MENSAGEM_CAMPO_NOME_TAMANHO_MAXIMO);
		}
	}
	
	private void validaDataMaiorQueDataAtual() {
		if(_evento.getDataEvento().isBefore(HOJE)) {
			throw new regraNegocioException(MENSAGEM_CAMPO_DATA_MENOR_QUE_HOJE);
		}
	}

}
