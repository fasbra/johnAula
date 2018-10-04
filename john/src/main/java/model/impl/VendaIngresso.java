package model.impl;

import model.impl.ov.Periodo;

import java.time.LocalDate;
import java.util.List;

import model.Ingresso;

public class VendaIngresso {

	private Periodo periodoDeVendaDeIngresso;
	private Evento evento;
	private List<Ingresso> ingressosDisponiveis;
	
	public VendaIngresso(Periodo periodoDeVenda) {
		this.periodoDeVendaDeIngresso = periodoDeVenda;
	}
	
	public void alteraDataFinalVendaIngresso(LocalDate novaDataFinal, Evento evento) {
		Periodo novoPeriodo = new Periodo(this.periodoDeVendaDeIngresso.getDataInicial(), novaDataFinal);
		this.periodoDeVendaDeIngresso = novoPeriodo;
		this.evento = evento;
	}
	
	public void adicionaIngressoParaVenda(Ingresso ingresso) {
		ingressosDisponiveis.add(ingresso);
	}

	public Periodo getPeriodoDeVendaDeIngresso() {
		return periodoDeVendaDeIngresso;
	}

	public Evento getEvento() {
		return evento;
	}

	public List<Ingresso> getIngressosDisponiveis() {
		return ingressosDisponiveis;
	}

}
