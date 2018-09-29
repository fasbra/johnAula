package model.impl;

import java.util.Date;

public class Evento {
	
	public String Nome;
	
	public Date DataEvento;
	
	public Evento(String nome, Date data) {
		this.Nome = nome;
		this.DataEvento = data;
	}
		
	public String getNome() {
		return Nome;
	}

	public Date getDataEvento() {
		return DataEvento;
	}

}
