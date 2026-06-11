package lista10.correcao;

public class MensalidadeEnsino implements Pagavel {

	private int nrCredito;
	private double precoCredito;

	public MensalidadeEnsino(int nrCredito, double precoCredito) {
		this.nrCredito = nrCredito;
		this.precoCredito = precoCredito;
	}

	@Override
	public double calcularValorPago() {
		return nrCredito * precoCredito;
	}

}
