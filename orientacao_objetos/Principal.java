package orientacao_objetos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro();
		
		livro.nome = "Bóson Linux";
		livro.descricao = "Livro sobre Linux da Bóson";
		livro.isbn = "97867186617";
		livro.preco = 45.95;
		livro.autor = "Fábio dos Reis";
		livro.dataPub = "20/04/2017";
		
		//System.out.printf("A data de publicação do livro %s é %s", livro.nome, livro.dataPub);
		livro.dadosLivro();
	}

}
