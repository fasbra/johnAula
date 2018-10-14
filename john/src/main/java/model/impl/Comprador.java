package model.impl;

import model.impl.desconto.*;
import model.Desconto;

public enum Comprador {

	OURO(new OuroDesconto()),
	PRATA(new PrataDesconto()),	
	ESTUDANTE(new EstudanteDesconto()),
	IDOSO(new IdosoDesconto()),
	NORMAL(new SemDesconto());
	
	private Desconto desconto;
	
	private Comprador(Desconto desconto) {
		this.desconto = desconto;
	}
	
	public Desconto getDesconto() {
		return this.desconto;
	}
}
