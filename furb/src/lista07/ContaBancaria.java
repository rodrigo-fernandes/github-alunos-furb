package lista07;

public class ContaBancaria {

	private String numero;
	private double saldo;
	private Cliente cliente;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor deve ser maior que zero");
		}

		setSaldo(getSaldo() + valor);
	}
	
	public void sacar(double valor) {
		if (valor <= 0 || getSaldo() < valor) {
			throw new IllegalArgumentException("Valor inválido para saque");
		}
		
		setSaldo(getSaldo() - valor);
	}
	
	public void transferir(ContaBancaria contaDestino, double valor) {
		sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
