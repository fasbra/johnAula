package model.impl.ov;

import java.time.LocalDate;

public class Periodo {
	
	private LocalDate dataInicial;	
	private LocalDate dataFinal;
	
	public Periodo(LocalDate dataInicial, LocalDate dataFinal) {
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
}
