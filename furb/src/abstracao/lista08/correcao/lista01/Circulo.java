package abstracao.lista08.correcao.lista01;

public class Circulo extends Figura {

	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	@Override
	double calcularArea() {
		return 3.14 * Math.pow(raio, raio);
	}

}
