
public class EntendendoFuncoesReturn {

	public static void saudacao() {
		System.out.println("Olá");

	}

	public static int anoLancamento() {
		return 1977;
	}

	public static void main(String[] args) {
		int ano;
		saudacao();
		ano = anoLancamento();
		System.out.println(ano);
		System.out.println(anoLancamento());
	}

}
