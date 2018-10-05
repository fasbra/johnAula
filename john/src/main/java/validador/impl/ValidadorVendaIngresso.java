package validador.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.NotImplementedException;
import exception.CampoObrigatorioException;
import exception.RegraNegocioException;
import model.Ingresso;
import model.impl.Evento;
import model.impl.IngressoBackStage;
import model.impl.VendaIngresso;
import model.impl.TipoIngresso;
import validador.Validador;

public class ValidadorVendaIngresso implements Validador<VendaIngresso> {

	private static final String PERIODO_OBRIGATORIO = "Período de venda obrigatório.";
	private static final String EVENTO_OBRIGATORIO = "Evento obrigatório para venda de ingresso.";

	private static final String DATA_FINAL_EVENTO_ANTERIOR_DATA_INICIAL = "A data de início de venda deve ser inferior a data de fim";
	private static final String SEM_INGRESSOS_DISPONIVEIS = "Evento não possuí ingressos há venda.";
	private static final String INGRESSO_DUPLICADO = "Venda com ingressos duplicados.";

	public void valida(VendaIngresso vendaIngresso) {
		validaPeriodoObrigatorio(vendaIngresso);
		validaPeriodoComDataInicialAnteriorADataFinal(vendaIngresso);
		validaEventoObrigatorio(vendaIngresso);
		validaIngressoAdicionadosAVenda(vendaIngresso);
		validaIngressosAVendaSemDuplicidades(vendaIngresso);
	}
	
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

	public void validaPeriodoComDataInicialAnteriorADataFinal (VendaIngresso vendaIngresso) {
		LocalDate dataInicioVenda = vendaIngresso.getPeriodoDeVendaDeIngresso().getDataInicial();
		LocalDate dataFinalVenda = vendaIngresso.getPeriodoDeVendaDeIngresso().getDataFinal();

		if (dataFinalVenda.isBefore(dataInicioVenda)) {
			throw new RegraNegocioException(DATA_FINAL_EVENTO_ANTERIOR_DATA_INICIAL);
		}
	}

	public void validaIngressoAdicionadosAVenda (VendaIngresso vendaIngresso) {
		if (vendaIngresso.getIngressosDisponiveis().isEmpty()) {
			throw new CampoObrigatorioException(SEM_INGRESSOS_DISPONIVEIS);
		}
	}

	public void validaIngressosAVendaSemDuplicidades (VendaIngresso vendaIngresso) {
		List<Ingresso> ingressosAVenda = vendaIngresso.getIngressosDisponiveis();
		List<TipoIngresso> tipos = new ArrayList<TipoIngresso>();
		
		ingressosAVenda.forEach( ingresso -> {
			TipoIngresso tipo = ingresso.getTipoIngresso();
			
			if(!tipos.contains(tipo))
				tipos.add(tipo);
			else
				throw new RegraNegocioException(INGRESSO_DUPLICADO);
		});
	}

}
