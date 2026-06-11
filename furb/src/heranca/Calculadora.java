package heranca;

/**
 * @author Rodrigo Fernandes
 */
public class Calculadora {

	private Double memoria;

	public Double getMemoria() {
		return memoria;
	}

	public void setMemoria(Double memoria) {
		this.memoria = memoria;
	}

	/**
	 * Metodo realizado para somar dois valores
	 * 
	 * @param valor1
	 * @param valor2
	 * @return soma de dois valores
	 */
	protected Double somar(Double valor1, Double valor2) {
		Double valorSomado = valor1 + valor2;
		setMemoria(valorSomado);
		return valorSomado;
	}

	/**
	 * Metodo realizado para subtrair dois valores
	 * 
	 * @param valor1
	 * @param valor2
	 * @return subtracao de dois valores
	 */
	public Double subtrair(Double valor1, Double valor2) {
		Double valorSubtracao = valor1 + valor2;
		setMemoria(valorSubtracao);
		return valorSubtracao;
	}

}
