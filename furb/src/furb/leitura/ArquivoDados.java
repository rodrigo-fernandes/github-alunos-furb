package furb.leitura;

import java.io.Serializable;
import java.util.List;

public class ArquivoDados implements Serializable {

	private static final long serialVersionUID = -2651024786012096090L;

	private Empresa empresa;
	private List<Funcionario> funcionarios;

	public ArquivoDados(Empresa empresa, List<Funcionario> funcionarios) {
		this.empresa = empresa;
		this.funcionarios = funcionarios;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

}
