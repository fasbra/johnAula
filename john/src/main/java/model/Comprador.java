package model;

import model.impl.desconto.*;

public enum Comprador {
	
	ESTUDANTE(new EstudanteDesconto()),
	IDOSO(new IdosoDesconto()),
	OURO(new OuroDesconto()),
	PRATA(new PrataDesconto()),
	SEM_DESCONTO(new SemDesconto());
	
	private Desconto desconto;
	
	private Comprador(Desconto desconto){
		this.desconto = desconto;
	}
	
	public Desconto getDesconto() {
		return this.desconto;
	}

}
