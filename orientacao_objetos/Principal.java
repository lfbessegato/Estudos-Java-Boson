package orientacao_objetos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro();
		
		livro.nome = "B�son Linux";
		livro.descricao = "Livro sobre Linux da B�son";
		livro.isbn = "97867186617";
		livro.preco = 45.95;
		livro.autor = "F�bio dos Reis";
		livro.dataPub = "20/04/2017";
		
		//System.out.printf("A data de publica��o do livro %s � %s", livro.nome, livro.dataPub);
		livro.dadosLivro();
	}

}
