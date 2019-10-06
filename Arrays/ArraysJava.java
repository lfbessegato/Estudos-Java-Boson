package Arrays;

public class ArraysJava {
	public static void main(String[] args) {
		double[] valores = new double[6];
		
		// Preencher Array
		valores[0] = 6.0;
		valores[1] = 7.5;
		valores[2] = 8.2;
		valores[3] = 2.3;
		valores[4] = 1.5;
		valores[5] = 4.9;
		
		//Acessando seu quinto elemento (número de posição 4)
		System.out.println("Elemento 5 do array: " + valores[4]);
		
		//Alterando os valores de duas posições no array
		valores[0] = 2.3;
		valores[4] = 7.1;
		
		//Acessando os elementos alterados:
		System.out.println("Posição 0 alterada para: " + valores[0]);
		System.out.println("Posição 4 alterada para: " + valores[4]);
		
		//Mostrar todos os elementos do Array
		for (double elemento: valores) {
			System.out.println(elemento);
		}
		
		//Somar os elementos do Array
		double total = 0;
		for (int i = 0; i < valores.length; i++) {
			total += valores[i];
		}
		System.out.println("O total é: " + total);
	}
}
