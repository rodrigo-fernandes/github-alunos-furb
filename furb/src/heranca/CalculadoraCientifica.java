package heranca;

public class CalculadoraCientifica extends Calculadora {

	private Double memoria;

	public Double getMemoria() {
		return memoria;
	}

	public void setMemoria(Double memoria) {
		this.memoria = memoria;
	}

	public Double calculaTaxaIOF(Double valor1, Double valor2, int valor3) {
		return (valor1 + valor2) * valor3;
	}

}
