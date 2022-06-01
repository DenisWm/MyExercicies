package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	int idcompra;
	
	List<Item> itens = new ArrayList<>();
	
	Compra(int idcompra) {
		this.idcompra = idcompra;
	}
	
	void adicionarItem(String nome, double preco, int qtde) {
		this.itens.add(new Item(nome, preco, qtde));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item itens: itens) {
			total += itens.produto.preco * itens.quantidade;
		}
		return total;
	}
}
