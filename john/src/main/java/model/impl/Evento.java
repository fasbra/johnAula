package model.impl;

import java.time.LocalDate;

public class Evento {
	
	public String Nome;
	
	public LocalDate DataEvento;
	
	public Evento(String nome, LocalDate data) {
		this.Nome = nome;
		this.DataEvento = data;
	}
		
	public String getNome() {
		return Nome;
	}

	public LocalDate getDataEvento() {
		return DataEvento;
	}

}
