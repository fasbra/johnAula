package model.impl.desconto;

import model.Desconto;

public class SemDesconto implements Desconto {

	@Override
	public Double getPercentualDeDesconto() {

		return new Double(0);
		
	}

}
