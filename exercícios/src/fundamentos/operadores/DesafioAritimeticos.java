package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {
		
		int numA = (int) Math.pow((6 * (3 + 2)), 2);
		int denB = 3*2;
		int superiorA = numA/denB;
		int superiorB = (int) Math.pow((((1 - 5) * (2 - 7))/2), 2);
		int superior = (int) Math.pow(superiorA - superiorB, 3);
		int inferior = (int) Math.pow(10, 3);
		int e = superior/inferior;
		
		System.out.println(e);
	}
}
