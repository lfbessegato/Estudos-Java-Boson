package metodos_sobrecarregados;

public class Expoente {
	// M�todo n�o calcula nada 
	public static void elevar() {
		System.out.println("Este m�todo n�o calcula nada!");
	}
	
	
	// Metodo que calcula o quadrado de i
	public static double elevar(double i) {
		return i * i;
	}
	
	// M�otodo que calcula i elevado a j
	public static double elevar(double i, double j) {
		return Math.pow(i, j);
	}
	
	

}
