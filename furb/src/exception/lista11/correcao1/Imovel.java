package exception.lista11.correcao1;

public class Imovel {
	private String endereco;
	private int area;
	private Finalidade finalidade;
	private Bairro bairro;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		if (area <= 0) { 
			throw new 
			IllegalArgumentException("área do imóvel inválida.");
		}
		this.area = area;
	}

	public Finalidade getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(Finalidade finalidade) {
		this.finalidade = finalidade;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public double calcularIptu() {
		
		if (getBairro() == null) {
			throw new IllegalArgumentException(
					"O bairro não foi definido");
		}
		
		if (getBairro().getCoeficienteIptu() < 0) {
			throw new IllegalArgumentException(
				"O coeficiente de iptu do bairro é inválido");
		}
		
		if (getFinalidade() == null) {
			throw new IllegalArgumentException(
					"A finalidade não foi definida");
		}
		
		if (getArea() == 0) {
			throw new IllegalArgumentException(
					"A área do imóvel não foi definida");
		}

		double valorIptu = 0;

		switch (getFinalidade()) {
		case RESIDENCIAL:
			/* Para imóveis cuja finalidade é residencial, cobra-se R$ 1,00 para cada m2 */
			valorIptu = getArea() * 1.00;
			break;
		case COMERCIAL:
			if (getArea() <= 100) {
				/* Imóveis com até 100 m2, cobra-se R$ 500,00; */
				valorIptu = 500;
			} else if (getArea() <= 400) {
				/* Imóveis acima de 100 m2 e até 400 m2, cobra-se R$ 1.000,00; */
				valorIptu = 1000;
			} else {
				/*
				 * Imóveis acima de 400 m2 cobra-se R$ 2,55 para cada m2
				 */
				valorIptu = getArea() * 2.55;
			}

			break;
		case INDUSTRIAL:
			if (getArea() <= 2000) {
				/* Imóveis com até 2.000 m2 cobra-se R$ 1.000,00; */
				valorIptu = 1000;
			} else {
				/* Acima de 2.000 m2, cobra-se R$ R$ 0,55 por m2 */
				valorIptu = getArea() * 0.55;
			}
			break;
		}

		/* coeficiente multiplicativo por bairro */
		valorIptu = valorIptu * getBairro().getCoeficienteIptu();

		return valorIptu;

	}

}
