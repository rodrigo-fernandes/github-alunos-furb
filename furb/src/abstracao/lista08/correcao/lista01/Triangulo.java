package abstracao.lista08.correcao.lista01;

public class Triangulo extends Figura {

	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	@Override
	double calcularArea() {
		double calculoLado = (this.lado1 + this.lado2 + this.lado3) / 2;
		double calculoAux = Math.sqrt(
				calculoLado * (calculoLado - lado1)
				* (calculoLado - lado2) 
				* (calculoLado - lado3)); 
		
		return calculoAux;
	}

}
