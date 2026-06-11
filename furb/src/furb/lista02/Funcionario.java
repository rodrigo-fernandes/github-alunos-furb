package furb.lista02;

public class Funcionario {

	private String nome;
	private double salario;

	public Funcionario() {
	}

	public Funcionario(String nome, double salario) {
		setNome(nome);
		setSalario(salario);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setSalario(double salario) {
		if (salario <= 0) {
			throw new IllegalArgumentException("Salário deve ser maior que Zero");
		}

		this.salario = salario;
	}

	public double getSalario() {
		return this.salario;
	}

	public double calcularIrpf() {
		double imposto = 0;
		double diferenca = 0;

//		valor da 1ª faixa, pois é isento de imposto
		if (getSalario() > 1903.98) {

//			calcula a 2ª faixa
			if (getSalario() <= 2826.65) {
				diferenca = (getSalario() - 1903.98);

				imposto = diferenca * (7.5 / 100);

//			calcula a 3ª faixa
			} else if (getSalario() <= 3751.05) {

//				calcula imposto na faixa 2
				diferenca = (2826.65 - 1903.98);
				imposto = diferenca * (7.5 / 100);

//				calcula o imposto na faixa 3
				diferenca = (getSalario() - 2826.65);
				imposto += (diferenca * (15.0 / 100));

//			calcula a 4ª faixa
			} else if (getSalario() <= 4664.68) {

//				calcula imposto na faixa 2
				diferenca = (2826.65 - 1903.98);
				imposto = diferenca * (7.5 / 100);

//				calcula imposto na faixa 3
				diferenca = (3751.05 - 2826.65);
				imposto += (diferenca * (15.0 / 100));

//				calcula imposto na faixa 4
				diferenca = (getSalario() - 3751.05);
				imposto += (diferenca * (22.5 / 100));

			} else {
//				calcula a 5ª faixa

//				calcula imposto na faixa 2
				diferenca = (2826.65 - 1903.98);
				imposto = diferenca * (7.5 / 100);

//				calcula imposto na faixa 3
				diferenca = (3751.05 - 3751.05);
				imposto += diferenca * (15.0 / 100);

//				calcula imposto na faixa 4
				diferenca = (4664.68 - 3751.05);
				imposto += diferenca * (22.5 / 100);

//				calcula imposto na faixa 5
				diferenca = (getSalario() - 4664.68);
				imposto += diferenca * (27.5 / 100);
			}
		}

		return imposto;

	}

	public FaixaIrpf identificarFaixaIrpf() {

		if (getSalario() <= 1903.98) {
			return FaixaIrpf.PRIMEIRA;
		} else if (getSalario() <= 2826.65) {
			return FaixaIrpf.SEGUNDA;
		} else if (getSalario() <= 3751.05) {
			return FaixaIrpf.TERCEIRA;
		} else if (getSalario() <= 4664.68) {
			return FaixaIrpf.QUARTA;
		}

		return FaixaIrpf.QUINTA;

	}

}
