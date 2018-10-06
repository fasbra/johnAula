package model.impl;

import model.impl.ov.Periodo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Ingresso;

public class VendaIngresso {

	private Periodo periodoDeVendaDeIngresso;
	private Evento evento;
	private List<Ingresso> ingressosDisponiveis;
	
	private void inicializa() {
		this.ingressosDisponiveis = new ArrayList<Ingresso>();
	}
	
	public VendaIngresso(Periodo periodoDeVenda) {
		inicializa();
		this.periodoDeVendaDeIngresso = periodoDeVenda;
	}
	
	public void informaEvento(Evento evento) {
		this.evento = evento;
	}
	
	public void informaPeriodoDeVenda(Periodo periodo) {
		this.periodoDeVendaDeIngresso = periodo;
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
