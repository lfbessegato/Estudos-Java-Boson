package varClasseInstancia;

public class Futebol {
	private String nomeTime; //var de Instância
	private static String nomeSelecao; // var de classe
	
	public void setTime(String meuTime) {
		nomeTime = meuTime;
	}
	
	public String getTime() {
		return nomeTime;
	}
	
	public void setSelecao(String selecao) {
		nomeSelecao = selecao;
	}
	
	public String getSelecao() {
		return nomeSelecao;
	}
	
	public void mostraTime() {
		System.out.printf("Seu time do coração é %s\n",getTime());
	}
	
	public void mostraSelecao() {
		System.out.printf("Sua seleção é %s\n",getSelecao());
	}

}
