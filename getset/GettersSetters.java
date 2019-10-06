package getset;

import java.util.Scanner;

public class GettersSetters {
	public static void main(String[] args) {
		String time;
		Futebol torcida = new Futebol();
		Scanner texto = new Scanner(System.in);
		
		System.out.println("Para qual time você torce?: ");
		time = texto.nextLine();
		
		torcida.setTime(time);
		torcida.mostraTime();
		
		texto.close();
	}

}
