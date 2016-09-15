package model;

import java.util.Date;

public class Vendas {
	
	private Cliente cliente;
	private Date data;
	private Produto itemDeVenda;
	
	public Vendas() {
		super();
	}

	public Vendas(Cliente cliente, Date data, Produto itemDeVenda) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.itemDeVenda = itemDeVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produto getItemDeVenda() {
		return itemDeVenda;
	}

	public void setItemDeVenda(Produto itemDeVenda) {
		this.itemDeVenda = itemDeVenda;
	}
	
	

}
