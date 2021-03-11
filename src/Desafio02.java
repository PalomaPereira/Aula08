import java.util.Scanner;

public class Desafio02 {
	/*
	 * Para um ano ser bissexto ele deve ser múltiplo de 4, mas não ser múltiplo de
	 * 100 (com exceção dos anos que forem múltiplos de 400). Crie um programa com
	 * uma função que receba um ano em uma variável inteira, faça os testes para
	 * verificar se ele é bissexto, e retorne uma String dizendo “O ano informado é
	 * bissexto” ou “O ano informado não é bissexto). A main do seu programa deve
	 * conter a digitação do ano, a chamada da função e a exibição do texto
	 * retornado.
	 * 
	 * 
	 */

	public static boolean verificaAno(int ano) {

		int multiplo4, multiplo100, multiplo400;

		multiplo4 = ano % 4;
		multiplo100 = ano % 100;
		multiplo400 = ano % 400;

		if (multiplo400 == 0) {
			return true;
		} else if (multiplo100 != 0 && multiplo4 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int ano;

		System.out.println("Informe o ano a ser verificado:");
		ano = leitor.nextInt();

		if (verificaAno(ano)) {
			System.out.println("O ano informado é bissexto!");
		} else {
			System.out.println("O ano informado não é bissexto!");
		}

		leitor.close();
	}
}
