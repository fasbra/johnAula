package model;

import model.impl.desconto.*;

public enum Comprador {
	
	ESTUDANTE (new EstudanteDesconto());
	
	private Desconto desconto;
	
	private Comprador(Desconto desconto){
		this.desconto = desconto;
	}
	
	public Desconto getDesconto() {
		return this.desconto;
	}

}
