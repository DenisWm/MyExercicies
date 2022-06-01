package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Roberto Carlos da Silva");
		
		Compra b1 = new Compra(01);
		
		b1.adicionarItem("Caneta", 1, 10);
		b1.adicionarItem("Caderno", 10, 1);
		
		System.out.println(b1.obterValorTotal());
		
		Compra b2 = new Compra(02);
		
		b2.adicionarItem("Facão", 15, 3);
		b2.adicionarItem("Camiseta", 50, 2);
		
		System.out.println(b2.obterValorTotal());
		
		c1.adicionarCompra(b1);
		c1.adicionarCompra(b2);
		System.out.println(c1.obterValorTotal());
		
		
	}
}