package model;

public class ItemDeVenda {
	
	private int quantidade;
	private Produto produto;
	
	public ItemDeVenda(){
		super();
	}

	public ItemDeVenda(int quantidade, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
