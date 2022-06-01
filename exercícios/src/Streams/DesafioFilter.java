package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 5000.00, .35, 120);
		Produto p2 = new Produto("Hard Drive", 335.55, .40, 60);
		Produto p3 = new Produto("Placa de Video", 6500.00, .50, 30);
		Produto p4 = new Produto("Processador", 4500.00, .50, 35);
		Produto p5 = new Produto("Mouse", 40.00, .15, 15);
		Produto p6 = new Produto("Teclado", 120.00, .10, 50);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5 ,p6);
		
		Predicate<Produto> promocaoDesconto = a -> a.desconto >= .40;
		Predicate<Produto> promocaofrete = a -> a.frete <= 30;
		Function<Produto, String> chamadaPromocional = p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		
		produtos.stream()
			.filter(promocaoDesconto)
			.filter(promocaofrete)
			.map(chamadaPromocional)
			.forEach(System.out::println);
	}
}
