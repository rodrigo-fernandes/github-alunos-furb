package lista10.correcao;

public class PrevidenciaPrivada extends Investimento {

	private double valor;

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double calcularValorPago() {
		return valor;
	}

	public void investir() {
		setSaldo(getSaldo() + this.valor);
	}

}
