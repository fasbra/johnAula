package validador.impl;

import java.time.LocalDate;
import org.apache.commons.lang.NotImplementedException;
import exception.CampoObrigatorioException;
import exception.RegraNegocioException;
import model.Ingresso;
import model.impl.IngressoBackStage;
import model.impl.VendaIngresso;

public class ValidadorVendaIngresso {

	private static final String PERIODO_OBRIGATORIO = "Período de venda obrigatório.";
	private static final String EVENTO_OBRIGATORIO = "Evento obrigatório para venda de ingresso.";

	private static final String DATA_FINAL_EVENTO_ANTERIOR_DATA_INICIAL = "A data final deve ser maior ou igual a data inicial do evento";

	public void validaPeriodoObrigatorio(VendaIngresso vendaIngresso) {
		if (vendaIngresso.getPeriodoDeVendaDeIngresso() == null) {
			throw new CampoObrigatorioException(PERIODO_OBRIGATORIO);
		}
	}

	public void validaEventoObrigatorio(VendaIngresso vendaIngresso) {
		if (vendaIngresso.getEvento() == null) {
			throw new CampoObrigatorioException(EVENTO_OBRIGATORIO);
		}
	}

	public void validaIngressoAdicionadoAVenda(VendaIngresso vendaIngresso) {
		Ingresso ingresso = new IngressoBackStage();
		vendaIngresso.adicionaIngressoParaVenda(ingresso);
		throw new NotImplementedException();
	}

	public void validaPeriodoComDataInicialAnteriorADataFinal(VendaIngresso vendaIngresso) {
		LocalDate dataInicioVenda = vendaIngresso.getPeriodoDeVendaDeIngresso().getDataInicial();
		LocalDate dataFinalVenda = vendaIngresso.getPeriodoDeVendaDeIngresso().getDataFinal();

		if (dataFinalVenda.isBefore(dataInicioVenda)) {
			throw new RegraNegocioException(DATA_FINAL_EVENTO_ANTERIOR_DATA_INICIAL);
		}
	}

	public void validaIngressosAVenda(VendaIngresso vendaIngresso) {
		// TODO Auto-generated method stub
		throw new NotImplementedException();
	}

}
