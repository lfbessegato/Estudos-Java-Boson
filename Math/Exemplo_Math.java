package Math;

public class Exemplo_Math {
	
	public static void main(String[] args) {
		int x = 3;
		int y = 4;
		double z = 81.56;
		
		System.out.println("Pi vale: " + Math.PI);
		System.out.println("O valor absoluto de X é: " + Math.abs(x));
		System.out.println("O maior valor entre x e y: " + Math.max(x,y));
		System.out.println("O menor valor entre x e y: " + Math.min(x, y));
		System.out.println("A raiz quadrada de z é: " + Math.sqrt(z));
		System.out.println("z arredondado para cima é: " + Math.ceil(z));
		System.out.println("Número aleatório gerado: " + Math.random());
		System.out.println("A hipotenusa de x e y é: " + Math.hypot(x, y));
		System.out.println("O seno de 90º é: " + Math.sin(Math.PI/2));
	}

}
