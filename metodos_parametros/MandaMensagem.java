package metodos_parametros;

public class MandaMensagem {
	public void enviaMensagem() {
		System.out.println("Bem-vindo à Bóson Treinamentos");
	}
	
	public void mandaBoasVindas(String nome) {
		System.out.println("Bem-vindo ao curso de Java, " + nome);
	}
	
	public void nomeIdade(String nome, int idade) {
		System.out.printf("Olá, %s, você tem  %d anos de idade ", nome, idade);
	}

}
