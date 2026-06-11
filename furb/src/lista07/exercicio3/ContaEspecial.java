package lista07.exercicio3;

public class ContaEspecial extends ContaBancaria {

	double limiteCredito;

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= 0 || (getSaldo() + getLimiteCredito() < valor)) {
			throw new IllegalArgumentException("Valor inválido para saque");
		}

		setSaldo(getSaldo() - valor);
	}

}
