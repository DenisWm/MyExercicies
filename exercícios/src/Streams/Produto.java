package Streams;

public class Produto {

	final String nome;
	final double preco;
	final double desconto;
	final double frete;
	
	public Produto(String nome, double preco, double desconto, double frete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
	}

	@Override
	public String toString() {
		return "O produto " + nome + ", que custa " + preco + " reais, e tem desconto de " + desconto + " %, está com frete de " + frete + " reais";
	}
	
	
}
