package controle;

import java.util.Scanner;

public class ExemploUm {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero ou -1 p/ sair: ");
		numero = entrada.nextInt();
		
		while (!(numero == -1)) {
			System.out.println("O numero est� entre 0 e 10?");
			
			if (numero >=0 && numero <= 10 && numero % 2 == 1) {
				System.out.println("Sim, e 0 n�mero � impar");
				System.out.print("Digite um n�mero ou -1 p/ sair: ");
				numero = entrada.nextInt();	
			}else if (numero >=0 && numero <= 10 && numero % 2 == 0) {
				System.out.println("Sim, e o n�mero � par");			
				System.out.print("Digite um n�mero ou -1 p/ sair: ");
				numero = entrada.nextInt();	
				} else {
					System.out.println("O n�mero n�o est� entre 0 e 10!");
					System.out.print("Digite um n�mero ou -1 p/ sair: ");
					numero = entrada.nextInt();	
			}
		}
		System.out.println("FIM!!");
		entrada.close();
	}
}
