package Math;

public class Exemplo_Math {
	
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		double z = 81.56;
		
		System.out.println("Pi vale: " + Math.PI);
		System.out.println("O valor absoluto de X �: " + Math.abs(x));
		System.out.println("O maior valor entre x e y: " + Math.max(x,y));
		System.out.println("O menor valor entre x e y: " + Math.min(x, y));
		System.out.println("A raiz quadrada de z �: " + Math.sqrt(z));
		System.out.println("z arredondado para cima �: " + Math.ceil(z));
		System.out.println("N�mero aleat�rio gerado: " + Math.random());
		System.out.println("A hipotenusa de x e y �: " + Math.hypot(x, y));
		System.out.println("O seno de 90� �: " + Math.sin(Math.PI/2));
	}

}
