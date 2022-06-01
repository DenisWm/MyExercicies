package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data p1 = new Data();
		
		Data p2 = new Data(14, 5, 3140);
		
		System.out.println(p1.obterDataFormatada());
		
		p1.imprimirDataFormatada();
		p2.imprimirDataFormatada();
		
	}

}
