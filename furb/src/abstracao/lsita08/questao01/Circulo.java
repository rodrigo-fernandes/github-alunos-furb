package abstracao.lsita08.questao01;

public class Circulo extends Figura {

	private int raio;

	public Circulo(int raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return 3.14 * Math.pow(raio, 2);
	}

}
