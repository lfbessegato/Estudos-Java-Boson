package classeString;

public class ClasseString {
	public static void main(String[] args) {
		char[] arrayCarac = { 'B', 'o', 's', 'o', 'n', ' ', 'T', 'r', 'e', 'i', 'n', 'a','m','e','n','t','o','s'};
		String txt = new String("Fábio dos Reis");
		String txt4 = "Fábio dos Reis";
		
		// Três formas de Construtores da classe String
		String tex1 = new String();
		String tex2 = new String(txt);
		String tex3 = new String(arrayCarac);
		
		System.out.printf("tex1 = %s%ntex2 = %s%ntex3 = %s%n", tex1, tex2, tex3);
		
		// Comprimento da String
		System.out.printf("%nComprimento da String tex: %d caracteres", txt.length());
		
		// Criar um array de caracteres a partir de uma String:
		char[] arrayCar = new char[5];
		
		txt4.getChars(0, 5, arrayCar, 0);
		System.out.printf("%nO array de caracteres criado é: ");
		for (char caractere : arrayCar) {
			System.out.print(caractere);
		}
		
		// Mostrar um caractere com charAt
		System.out.printf("%nCaractere de índice 0 em tex3: %c%n ", tex3.charAt(0));
		
		// Mostrar os caracteres de tex3 em reverso com charAt
		System.out.printf("%nString tex3 de trás para frente: ");
		for (int cont = tex3.length() -1; cont >= 0; cont--) {
			System.out.printf("%c ",tex3.charAt(cont));
		}
	}

}
