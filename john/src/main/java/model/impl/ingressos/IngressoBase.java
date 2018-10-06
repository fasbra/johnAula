package model.impl.ingressos;

import model.Ingresso;

public class IngressoBase implements Ingresso {

	private int valor;
	private TipoIngresso tipo;
	
	IngressoBase(int valor, TipoIngresso tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public TipoIngresso getTipoIngresso() {
		return this.tipo;
	}

	public int getValor() {
		return this.valor;
	}

}
