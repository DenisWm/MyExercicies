package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0;
		double somaDasNotas = 0;
		int contador = 0;
		double sair = 0;
		
		while (nota != -1) {
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			if (nota >= 0 && nota <= 10) {
				somaDasNotas += nota;
				contador ++;
							
			} else if(nota != -1 ) {
				System.out.println("Nota inválida!!!! ;D");
			}
		}
		
		System.out.println("A média é: " + somaDasNotas / contador);
		
//		do {
//			System.out.print("Digite uma nota: ");
//			
//			nota = entrada.nextDouble();
//			
//			if (nota >= 0 && nota <= 10 && nota != -1) {
//				somaDasNotas += nota;
//				contador++;
//			} else if (nota == -1) {
//				sair = -1;
//			} else {
//				System.out.println("Digite uma nota válida entre 0 e 10!");
//			}
//		} while (!(sair == -1));
//		
//		System.out.printf("A média das notas valídas é %.2f", somaDasNotas / contador);			
		
		entrada.close();
	}
}
