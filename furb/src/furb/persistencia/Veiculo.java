package furb.persistencia;

import java.io.Serializable;

public class Veiculo implements Serializable {

	private static final long serialVersionUID = -4759737088510931927L;

	private String placa;
	private String nome;

	public Veiculo(String placa, String nome) {
		this.placa = placa;
		this.nome = nome;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
