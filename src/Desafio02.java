import java.util.Scanner;

public class Desafio02 {
	/*
	 * Para um ano ser bissexto ele deve ser m�ltiplo de 4, mas n�o ser m�ltiplo de
	 * 100 (com exce��o dos anos que forem m�ltiplos de 400). Crie um programa com
	 * uma fun��o que receba um ano em uma vari�vel inteira, fa�a os testes para
	 * verificar se ele � bissexto, e retorne uma String dizendo �O ano informado �
	 * bissexto� ou �O ano informado n�o � bissexto). A main do seu programa deve
	 * conter a digita��o do ano, a chamada da fun��o e a exibi��o do texto
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
			System.out.println("O ano informado � bissexto!");
		} else {
			System.out.println("O ano informado n�o � bissexto!");
		}

		leitor.close();
	}
}
