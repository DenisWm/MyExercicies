package controle;

import java.util.Scanner;

public class ExemploQuatro {

	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		int num;
//		System.out.print("Digite um número inteiro: ");
//		
//		num = entrada.nextInt();
//		
//		if (num == 2 ||
//			num == 3 ||
//			num == 5 ||
//			num == 7 ||
//			num == 9 ||
//			num == 11 ||(
//			num % 2 != 0 &&
//			num % 3 != 0 &&
//			num % 5 != 0 &&
//			num % 7 != 0 &&
//			num % 9 != 0 &&
//			num % 11 != 0)) { 
//			System.out.println("O numero é primo!");
//		} else {
//			System.out.println("O numero não é primo!");
//		}
//		entrada.close();
		int contadorDeDivisores = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nDigite um numero para verificar se é primo:");
		int numero = scanner.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		scanner.close();
	}
}
