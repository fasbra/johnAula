package servico.impl;

import validador.Validador;
import model.impl.*;

import dao.*;

public class ServicoEvento {
	
	private Validador<Evento> validador;
	private Dao<Evento> dao;

	public ServicoEvento(Validador<Evento> validador, Dao<Evento> dao) {
		this.validador = validador;
		this.dao = dao;
	}
	
	public void create(Evento evento) {
		validador.valida(evento);
		salva(evento);
	}
	
	public void salva(Evento evento) {
		dao.salvar(evento);
	}
	
}
