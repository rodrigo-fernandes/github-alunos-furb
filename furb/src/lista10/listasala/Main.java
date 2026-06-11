package lista10.listasala;

public class Main {

	public static void main(String[] args) {

		Contas minhaConta = new Contas();

		PrevidenciaPrivada c1 = new PrevidenciaPrivada();
		c1.setValor(500);
		c1.investir();
		c1.setValor(350);
		c1.investir();

		minhaConta.incluirConta(c1);

		// R$ 104
		minhaConta.incluirConta(new ContaAgua(13, 8));
		// R$ 1400
		minhaConta.incluirConta(new MensalidadeEnsino(7, 200));

		System.out.println("Valor Total das Contas: " + minhaConta.calcularTotalContas());

		for (Pagavel pagavelAtual : minhaConta.getContas()) {
			if (pagavelAtual instanceof PrevidenciaPrivada) {
				System.out.println("Valor a Pagar da Conta: " + pagavelAtual.calcularValorPagar() 
					+ " - Saldo: " + ((PrevidenciaPrivada) pagavelAtual).getSaldo());
			} else {
				System.out.println("Valor a Pagar da Conta: " + pagavelAtual.calcularValorPagar());
			}
		}
	}

}
