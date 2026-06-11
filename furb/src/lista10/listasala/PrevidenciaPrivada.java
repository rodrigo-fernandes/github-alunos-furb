package lista10.listasala;

public class PrevidenciaPrivada extends Investimento {
	private double valor;

	@Override
	public double calcularValorPagar() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void investir() {
		setSaldo(getSaldo() + valor);
	}

}
