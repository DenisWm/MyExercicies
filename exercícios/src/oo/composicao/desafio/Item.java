package oo.composicao.desafio;

public class Item {

	Produto produto;
	int quantidade;
	
	Item (Produto produto, int quantidade)  {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	Item (String nome, double preco, int quantidade)  {
		this.produto = new Produto(nome, preco);
		this.quantidade = quantidade;
	}
}
