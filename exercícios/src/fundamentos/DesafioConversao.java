package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("O Sal�rio 1 �?");				
		String salario1 = entrada.nextLine().replace(",",".");
		
		System.out.println("O Sal�rio 2 �?");
		String salario2 = entrada.nextLine().replace(",",".");
		
		System.out.println("O Sal�rio 3 �?");
		String salario3 = entrada.nextLine().replace(",",".");
		
		double sar1 = Double.parseDouble(salario1);
		double sar2 = Double.parseDouble(salario2);
		double sar3 = Double.parseDouble(salario2);
		
		System.out.println("A m�dia dos sal�rios �: " + (sar1 + sar2 + sar3)/3);
			
			
		
		
		
				
	}
}
