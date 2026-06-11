package furb.leitura;

import java.io.Serializable;

public class Funcionario implements Serializable {

	private static final long serialVersionUID = 6373420050888826574L;

	private int id;
	private String nome;
	private double valor;

	public Funcionario(int id, String nome, double valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return this.id + " - " + this.nome + " - " + this.valor;
	}
}
