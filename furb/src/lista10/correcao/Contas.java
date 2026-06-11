package lista10.correcao;

import java.util.ArrayList;

public class Contas {

	private ArrayList<Pagavel> contas = new ArrayList<>();

	public ArrayList<Pagavel> getContas() {
		return contas;
	}

	public void incluirConta(Pagavel conta) {
		contas.add(conta);
	}

	public double calcularTotalContas() {
		double total = 0;

		for (Pagavel contaAtual : contas) {
			total += contaAtual.calcularValorPago();
		}

		return total;
	}

}
