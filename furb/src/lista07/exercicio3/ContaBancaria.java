package lista07.exercicio3;

import java.util.ArrayList;

public class ContaBancaria {

	private String numero;
	private double saldo;
	private Cliente titular;
	private ArrayList<Movimento> movimentos = new ArrayList<>();

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public ArrayList<Movimento> getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(ArrayList<Movimento> movimentos) {
		this.movimentos = movimentos;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser maior que zero para depósito");
		}

		setSaldo(getSaldo() + valor);
		Movimento lancamento = new Movimento(valor, TipoMovimento.CREDITO);
		incluirMovimento(lancamento);
	}

	public void sacar(double valor) {
		if (valor <= 0 || getSaldo() < valor) {
			throw new IllegalArgumentException("Valor inválido para saque");
		}

		setSaldo(getSaldo() - valor);

		Movimento lancamento = new Movimento(valor, TipoMovimento.DEBITO);
		incluirMovimento(lancamento);
	}

	public void transferir(ContaBancaria contaBancaria, double valor) {
		sacar(valor);
		contaBancaria.depositar(valor);
	}

	public void incluirMovimento(Movimento movimento) {
		this.movimentos.add(movimento);
	}

}
