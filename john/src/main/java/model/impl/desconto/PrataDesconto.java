package model.impl.desconto;

import model.Desconto;

public class PrataDesconto implements Desconto{

	@Override
	public Double getPercentualDeDesconto() {

		return new Double(0.6);
		
	}

}
