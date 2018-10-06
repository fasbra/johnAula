package model;

import model.impl.desconto.EstudanteDesconto;
public enum Comprador {
	
	ESTUDANTE(new EstudanteDesconto());
	IDOSO(new IdosoDesconto());
	OURO(new OuroDesconto());
	PRATA(new PrataDesconto());
	SEM_DESCONTO(new SemDesconto());
	}

}
