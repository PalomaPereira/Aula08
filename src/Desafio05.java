import java.util.Scanner;

public class Desafio05 {
	/*
	 * A rede de supermercados Carre4 est� levando a s�rio as restri��es de
	 * isolamento social no Brasil. Est�o trabalhando para automatizar as portas das
	 * unidades, permitindo a entrada apenas das pessoas que est�o atendendo �s
	 * solicita��es. Toda a identifica��o das medidas necess�rias � feita atrav�s de
	 * c�meras e sensores de temperaturas. Sua tarefa � criar as fun��es que recebam
	 * essas medidas e informem se o cliente pode ou n�o entrar no estabelecimento.
	 * As fun��es s�o: � Temperatura: Clientes com temperatura superior a 37,0 graus
	 * n�o podem entrar no estabelecimento. � M�scara: Clientes sem m�scara n�o
	 * podem entrar no estabelecimento. � Fam�lias: grupos com mais de 2 pessoas n�o
	 * podem entrar no estabelecimento. � Fun��o agregadora: s� autoriza a entrada
	 * no estabelecimento de clientes que cumprirem com as 3 fun��es anteriores.
	 */

	public static boolean verificaTemperatura(double temperatura) {
		if (temperatura <= 37.0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean verificaMascara(String mascara) {
		if (mascara.equalsIgnoreCase("S")) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean verificaGrupo(int pessoas) {
		if (pessoas > 2) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		int pessoas;
		String mascara;
		Double temperatura;
		boolean falhaVerificacao = false;

		System.out.println("Informe quantas pessoas entrar�o no supermercado:");
		pessoas = leitor.nextInt();

		if (verificaGrupo(pessoas)) {
			for (int i = 1; i <= pessoas; i++) {
				System.out.println("Informe a temperatura da " + i + "� pessoa:");
				temperatura = leitor.nextDouble();
				System.out.println("Informe se a " + i + "� pessoa est� de m�scara: [S] ou [N]");
				mascara = leitor.next();

				if (!verificaMascara(mascara) || !verificaTemperatura(temperatura)) {
					falhaVerificacao = true;
					break;
				}
			}

			if (falhaVerificacao) {
				System.out.println("Clientes N�O est�o autorizados a entrar!");
			} else {
				System.out.println("Clientes est�o autorizados a entrar!");
			}

		} else {
			System.out.println("Quantidade de pessoas extrapola limite permitido!");
		}

	}

}
