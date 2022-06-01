package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		
		// Wrapprers são a versão objeto dos tipos
		// Primitivos
		int a = 123;
		System.out.println(a);		
	}
}
