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

	private static final String DATA_FINAL_EVENTO_ANTERIOR_DATA_INICIAL = "A data de início de venda deve ser inferior a data de fim";
	private static final String SEM_INGRESSOS_DISPONIVEIS = "Evento não possuí ingressos há venda.";

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
		if (vendaIngresso.getIngressosDisponiveis() == null) {
			throw new RegraNegocioException(SEM_INGRESSOS_DISPONIVEIS);
		}
	}

	public void validaPeriodoComDataInicialAnteriorADataFinal(VendaIngresso vendaIngresso) {
		LocalDate dataInicioVenda = vendaIngresso.getPeriodoDeVendaDeIngresso().getDataInicial();
		LocalDate dataFinalVenda = vendaIngresso.getPeriodoDeVendaDeIngresso().getDataFinal();

		if (dataFinalVenda.isBefore(dataInicioVenda)) {
			throw new RegraNegocioException(DATA_FINAL_EVENTO_ANTERIOR_DATA_INICIAL);
		}
	}

	public void validaIngressosAVenda(VendaIngresso vendaIngresso) {
		if (vendaIngresso.getIngressosDisponiveis() == null) {
			throw new RegraNegocioException(SEM_INGRESSOS_DISPONIVEIS);
		}
	}

}
