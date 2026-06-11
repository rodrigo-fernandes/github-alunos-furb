package exception.banco;

/**
 * Operacoes da Conta
 */
public interface OperacaoConta {
	
	void depositar(double valor);

	void sacar(double valor);

	void exibirSaldo();

}
