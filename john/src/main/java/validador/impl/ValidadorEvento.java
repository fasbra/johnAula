package validador.impl;

import exception.CampoObrigatorioException;
import exception.RegraNegocioException;

import java.time.LocalDate;

import org.apache.commons.lang.StringUtils;

import model.impl.Evento;
import validador.Validador;

public class ValidadorEvento implements Validador<Evento> {
	
	private static final String MENSAGEM_CAMPO_NOME_OBRIGATORIO = "Campo Nome do Evento nao informado"; 
	private static final String MENSAGEM_CAMPO_NOME_TAMANHO_MAXIMO = "O campo Nome tem um tamanho de no maximo 150 caracteres"	;
	
	private static final String MENSAGEM_CAMPO_DATA_OBRIGATORIO = "Camo Data do Evento nao informado";
	private static final String MENSAGEM_CAMPO_DATA_MENOR_QUE_HOJE = "A data deve ser maior ou igual a data atual";
	
	private static final int TAMANHO_MAXIMO_CAMPO_NOME = 150;
	private static final LocalDate HOJE = LocalDate.now();
	
	public void valida(Evento evento) {
		validaNomeObrigatorio(evento);
		validaDataObrigatoria(evento);
		validaTamanhoMaximoNome(evento);
		validaDataMaiorQueDataAtual(evento);
	}
	
	public void validaNomeObrigatorio(Evento evento) {
		if(StringUtils.isEmpty(evento.getNome())){
			throw new CampoObrigatorioException(MENSAGEM_CAMPO_NOME_OBRIGATORIO);
		}		
	}
	
	public void validaDataObrigatoria(Evento evento) {		
		if(evento.getDataEvento() == null){
			throw new CampoObrigatorioException(MENSAGEM_CAMPO_DATA_OBRIGATORIO);
		}		
	}
	
	public void validaTamanhoMaximoNome(Evento evento) {
		if(evento.getNome().length() > TAMANHO_MAXIMO_CAMPO_NOME ) {
			throw new RegraNegocioException(MENSAGEM_CAMPO_NOME_TAMANHO_MAXIMO);
		}
	}
	
	public void validaDataMaiorQueDataAtual(Evento evento) {
		if(evento.getDataEvento().isBefore(HOJE)) {
			throw new RegraNegocioException(MENSAGEM_CAMPO_DATA_MENOR_QUE_HOJE);
		}
	}

}
