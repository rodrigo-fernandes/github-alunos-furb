package lista10.correcao;

public class Main {

	public static void main(String[] args) {
		
		Contas minhaConta = new Contas();
		
		PrevidenciaPrivada previdenciaPrivada = new PrevidenciaPrivada();
		previdenciaPrivada.setValor(500);
		previdenciaPrivada.investir();
		previdenciaPrivada.setValor(350);
		previdenciaPrivada.investir();
		
		minhaConta.incluirConta(previdenciaPrivada);
		
		minhaConta.incluirConta(new ContaAgua(13, 8));
		
		minhaConta.incluirConta(new MensalidadeEnsino(7, 200));
		
		System.out.println("Valor total das Contas: " + minhaConta.calcularTotalContas());
		
		for (Pagavel contaAtual : minhaConta.getContas()) {
			if (contaAtual instanceof PrevidenciaPrivada) {
				System.out.println("Valor a Pagar da Conta: " + 
									minhaConta.calcularTotalContas() + 
									" - Saldo: " +
									((PrevidenciaPrivada) contaAtual).getSaldo());
			} else {
				System.out.println("Valor a Pagar da Conta: " + 
									minhaConta.calcularTotalContas());	
			}
		}

	}

}
