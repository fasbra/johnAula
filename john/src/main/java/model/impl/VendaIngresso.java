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
	
	public void alteraDataFinalVendaIngresso(LocalDate novaDataFinal) {
		Periodo novoPeriodo = new Periodo(this.periodoDeVendaDeIngresso.getDataInicial(), novaDataFinal);
		this.periodoDeVendaDeIngresso = novoPeriodo;
	}
	
	private static void inicioVendaDeIngresso() {

	}

	private static void fimDeVendaDeIngresso() {

	}

}
