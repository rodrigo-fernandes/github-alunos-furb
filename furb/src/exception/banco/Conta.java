package exception.banco;

public abstract class Conta implements OperacaoConta {

	private String titular;
	private double saldo;
	
	public void imprimirMensagemPadrao() {
		System.out.println("Teste");
	}
	
	public abstract void imprimirMensagemEspecifica();

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
