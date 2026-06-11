package abstracao.lista08.correcao.lista01;

public class Retangulo extends Figura {

	private int largura;
	private int altura;

	public Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	double calcularArea() {
		return this.largura * this.altura;
	}


}
