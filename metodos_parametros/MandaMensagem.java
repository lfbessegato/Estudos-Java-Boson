package metodos_parametros;

public class MandaMensagem {
	public void enviaMensagem() {
		System.out.println("Bem-vindo � B�son Treinamentos");
	}
	
	public void mandaBoasVindas(String nome) {
		System.out.println("Bem-vindo ao curso de Java, " + nome);
	}
	
	public void nomeIdade(String nome, int idade) {
		System.out.printf("Ol�, %s, voc� tem  %d anos de idade ", nome, idade);
	}

}
