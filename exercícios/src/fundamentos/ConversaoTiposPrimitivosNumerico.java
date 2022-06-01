package fundamentos;

public class ConversaoTiposPrimitivosNumerico {

	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		float b = (float) 1.12345;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(c);
		
		double e = 1;
		int f = (int) e;
		System.out.println(f);
	}
}
