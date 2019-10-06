package metodos_sobrecarregados;

public class Expoente {
	// Método não calcula nada 
	public static void elevar() {
		System.out.println("Este método não calcula nada!");
	}
	
	
	// Metodo que calcula o quadrado de i
	public static double elevar(double i) {
		return i * i;
	}
	
	// Méotodo que calcula i elevado a j
	public static double elevar(double i, double j) {
		return Math.pow(i, j);
	}
	
	

}
