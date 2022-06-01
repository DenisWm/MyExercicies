package Lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> precoDesconto = 
				n1 -> n1.preco * (1 - n1.desconto);
		
		UnaryOperator<Double> imposto = 
				n2 -> n2 >= 2500 ? n2 * 1.085 : n2;
		
		UnaryOperator<Double> frete = 
				n3 -> n3 >= 3000 ? n3 + 100: n3 + 50;
		
		Function<Double, String> arred = n4 -> new DecimalFormat("R$0.00").format(n4);
		
		System.out.println(precoDesconto.andThen(imposto).andThen(frete).andThen(arred).apply(p));
	}
}
