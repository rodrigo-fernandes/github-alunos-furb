package lista10.correcao;

public class ContaAgua implements Pagavel {

	private int metroCubico;
	private double precoMetroCubico;

	public ContaAgua(int metroCubico, double precoMetroCubico) {
		this.metroCubico = metroCubico;
		this.precoMetroCubico = precoMetroCubico;
	}

	@Override
	public double calcularValorPago() {
		return metroCubico * precoMetroCubico;
	}

}
