package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número.");
		double a = entrada.nextDouble();
		System.out.print("Digite o segundo número.");
		double b = entrada.nextDouble();
		System.out.print("Digite o operador");
		String operador = entrada.next();
		
		double resultado = "+".equals(operador) ? a + b : 0;
		resultado = "-".equals(operador) ? a - b : resultado;
		resultado = "*".equals(operador) ? a * b : resultado;
		resultado = "/".equals(operador) ? a / b : resultado;
		resultado = "%".equals(operador) ? a % b : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", a, operador, b, resultado);
		
		entrada.close();
	}
}