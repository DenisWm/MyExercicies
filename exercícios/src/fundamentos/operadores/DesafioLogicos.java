package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean TV50 = trabalho1 && trabalho2;
		boolean TV32 = trabalho1 ^ trabalho2;
		boolean svtdomingo = trabalho1 || trabalho2;
		boolean maisSaudavel = !svtdomingo;
		
		System.out.println("Comprou TV 50\"? " + TV50);
		System.out.println("Comprou TV 32\"? " + TV32);
		System.out.println("Comprou sorvete " + svtdomingo);
		System.out.println("Mais saudavel? " + maisSaudavel);
		
	 
	}
}
