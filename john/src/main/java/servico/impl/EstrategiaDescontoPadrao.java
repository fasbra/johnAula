package servico.impl;

import servico.EstrategiaDesconto;
import model.Comprador;
import model.Desconto;
import model.Ingresso;

public class EstrategiaDescontoPadrao implements EstrategiaDesconto {

	private Ingresso ingresso;
	private Comprador comprador;
	
	public EstrategiaDescontoPadrao(Ingresso ingresso, Comprador comprador) {
		this.ingresso = ingresso;
		this.comprador = comprador;
	}
	
	@Override
	public Double calcula() {
				
		Double valorDescontoSobreIngresso = ingresso.getValor() * comprador.getDesconto().getPercentualDeDesconto();
		Double valorIngressoComDesconto = ingresso.getValor() - valorDescontoSobreIngresso;
		
		return valorIngressoComDesconto;
	}

}
