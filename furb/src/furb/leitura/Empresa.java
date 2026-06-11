package furb.leitura;

import java.io.Serializable;

public class Empresa implements Serializable {

	private static final long serialVersionUID = 6621989980013722299L;

	private String empresa;
	private String data;

	public Empresa(String empresa, String data) {
		this.empresa = empresa;
		this.data = data;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Empresa: " + this.empresa + ", Data: " + this.data;
	}

}
