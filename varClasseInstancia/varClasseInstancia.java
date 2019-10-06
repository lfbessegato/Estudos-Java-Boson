package varClasseInstancia;

import java.util.Scanner;

public class varClasseInstancia {
	public static void main(String[] args) {
		String time;
		String selecao;
		
		Futebol torcida = new Futebol();
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Para qual time você torce?: ");
		time = texto.nextLine();
		System.out.println("Para qual seleção você torce?: ");
		selecao = texto.nextLine();
		
		torcida.setTime(time);
		torcida.setSelecao(selecao);
		torcida.mostraTime();
		torcida.mostraSelecao();
		
		
		Futebol torcida2 = new Futebol();
		torcida2.mostraTime();
		torcida2.mostraSelecao();
		
		torcida2.setSelecao("Japonesa");
		torcida.mostraSelecao();
		
		texto.close();
	}

}
