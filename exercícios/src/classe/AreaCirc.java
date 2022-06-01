package classe;

public class AreaCirc {

	double raio;
	static double PI = 3.14;
	
	AreaCirc (double raioInicial){
		PI = 3.14;
		raio = raioInicial;
	}
	double area() {
		return PI * Math.pow(raio, 2);
	}
}
