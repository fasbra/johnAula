package model.impl;

import java.time.LocalDate;

public class Evento {
	
	private String nome;	
	private LocalDate dataEvento;
	
	public Evento() {
		
	}
	
	public Evento(String nome, LocalDate data) {
		this.nome = nome;
		this.dataEvento = data;
	}
		
	public String getNome() {
		return nome;
	}

	public LocalDate getDataEvento() {
		return dataEvento;
	}

}
