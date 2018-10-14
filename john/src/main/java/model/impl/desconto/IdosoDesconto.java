package model.impl.desconto;

import model.Desconto;

public class IdosoDesconto implements Desconto {

	@Override
	public Double getPercentualDeDesconto() {

		return new Double(0.5);
		
	}

}
