package furb.persistencia;

import java.io.Serializable;

public class ContaBancaria implements Serializable {

	private static final long serialVersionUID = 6638769568840823745L;
	
	private String digito;
	private String nome;
	private double valor;

	public ContaBancaria(String digito, String nome, double valor) {
		this.digito = digito;
		this.nome = nome;
		this.valor = valor;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
