package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("O Salário 1 é?");				
		String salario1 = entrada.nextLine().replace(",",".");
		
		System.out.println("O Salário 2 é?");
		String salario2 = entrada.nextLine().replace(",",".");
		
		System.out.println("O Salário 3 é?");
		String salario3 = entrada.nextLine().replace(",",".");
		
		double sar1 = Double.parseDouble(salario1);
		double sar2 = Double.parseDouble(salario2);
		double sar3 = Double.parseDouble(salario2);
		
		System.out.println("A média dos salários é: " + (sar1 + sar2 + sar3)/3);
			
			
		
		
		
				
	}
}
