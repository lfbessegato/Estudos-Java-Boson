package orientacao_objetos;

public class Livro {
	String nome;
	String descricao;
	String autor;
	String isbn;
	double preco;
	String dataPub;
	
	void dadosLivro() {
		System.out.println("Nome do Livro: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Autor: " + autor);
		System.out.println("Data de Publicação: " + dataPub + "\n");
	}
}
