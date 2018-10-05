package servico.impl;

import java.util.List;

import dao.Dao;
import model.impl.VendaIngresso;
import model.impl.ov.Periodo;
import model.Ingresso;
import validador.Validador;

public class ServicoVendaIngresso {

	private Validador<VendaIngresso> validador;
	private Dao<VendaIngresso> dao;
	
	public ServicoVendaIngresso(Validador<VendaIngresso> validador, Dao<VendaIngresso> dao) {
		this.validador = validador;
		this.dao = dao;
	}
	
	public void create(VendaIngresso venda) {		
		validador.valida(venda);
		salva(venda);
	}
	
	public void create(VendaIngresso venda, List<Ingresso> ingressos) {
		incluiVariosIngressos(venda, ingressos);
		validador.valida(venda);
	}
	
	public void incluiVariosIngressos(VendaIngresso venda, List<Ingresso> ingressos) {
		ingressos.forEach(ingresso -> incluiIngresso(venda, ingresso));
		validador.valida(venda);
	}
	
	public void incluiIngresso(VendaIngresso venda, Ingresso ingresso) {
		venda.adicionaIngressoParaVenda(ingresso);
		validador.valida(venda);
	}
	
	public void informaPeriodoDeVenda(VendaIngresso venda, Periodo periodo) {
		venda.informaPeriodoDeVenda(periodo);
		validador.valida(venda);
	}
	
	public void salva(VendaIngresso venda) {
		dao.salvar(venda);
	}
}
