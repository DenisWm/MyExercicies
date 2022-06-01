package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Arroz ingrediente1 = new Arroz(0.200);
		Feijao ingrediente2 = new Feijao(.100);
		Comida ingrediente3 = new Arroz(0.300);
		
		System.out.println(convidado.getPeso());
		
		convidado.Comer(ingrediente1);
		convidado.Comer(ingrediente2);
		convidado.Comer(ingrediente3);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.Comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}
}
