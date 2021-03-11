import java.util.Scanner;

public class Desafio05 {
	/*
	 * A rede de supermercados Carre4 está levando a sério as restrições de
	 * isolamento social no Brasil. Estão trabalhando para automatizar as portas das
	 * unidades, permitindo a entrada apenas das pessoas que estão atendendo às
	 * solicitações. Toda a identificação das medidas necessárias é feita através de
	 * câmeras e sensores de temperaturas. Sua tarefa é criar as funções que recebam
	 * essas medidas e informem se o cliente pode ou não entrar no estabelecimento.
	 * As funções são: • Temperatura: Clientes com temperatura superior a 37,0 graus
	 * não podem entrar no estabelecimento. • Máscara: Clientes sem máscara não
	 * podem entrar no estabelecimento. • Famílias: grupos com mais de 2 pessoas não
	 * podem entrar no estabelecimento. • Função agregadora: só autoriza a entrada
	 * no estabelecimento de clientes que cumprirem com as 3 funções anteriores.
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

		System.out.println("Informe quantas pessoas entrarão no supermercado:");
		pessoas = leitor.nextInt();

		if (verificaGrupo(pessoas)) {
			for (int i = 1; i <= pessoas; i++) {
				System.out.println("Informe a temperatura da " + i + "ª pessoa:");
				temperatura = leitor.nextDouble();
				System.out.println("Informe se a " + i + "ª pessoa está de máscara: [S] ou [N]");
				mascara = leitor.next();

				if (!verificaMascara(mascara) || !verificaTemperatura(temperatura)) {
					falhaVerificacao = true;
					break;
				}
			}

			if (falhaVerificacao) {
				System.out.println("Clientes NÃO estão autorizados a entrar!");
			} else {
				System.out.println("Clientes estão autorizados a entrar!");
			}

		} else {
			System.out.println("Quantidade de pessoas extrapola limite permitido!");
		}

	}

}
