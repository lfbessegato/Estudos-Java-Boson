package metodos_parametros;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeAluno;
		int idadeAluno;
		Scanner entrada = new Scanner(System.in);
		
		MandaMensagem oi = new MandaMensagem();
		
		System.out.println("Entre com seu nome: ");
		nomeAluno = entrada.nextLine();
		
		System.out.println("Entre com sua idade: ");
		idadeAluno = entrada.nextInt();
		
		oi.mandaBoasVindas(nomeAluno);
		entrada.close();
		oi.enviaMensagem();
		oi.nomeIdade(nomeAluno, idadeAluno);
	}

}
