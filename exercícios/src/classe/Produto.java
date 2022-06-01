package classe;

public class Produto {

	String nome;
	double preco;
	static double DESCONTO = 0.25;
	
	Produto () {
		
	}
	Produto (String nomeInicial) {
		nome = nomeInicial;
		
	}
	Produto (String nomeInicial, double precoInicial) {
		
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto () {
		return preco * (1 - DESCONTO);
	}
	
	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - DESCONTO + descontoDoGerente);
	}
}
