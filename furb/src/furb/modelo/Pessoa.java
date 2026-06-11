package furb.modelo;

/*
 * Classe referente a uma Pessoa
 * 
 * */

public class Pessoa {

	private String nome;
	private float peso;
	private float altura;

//	 default/padrao sem nenhum contrutor na classe
	public Pessoa() {
	}

//	com TODOS os atributos
	public Pessoa(String nome, float peso, float altura) {
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

//	com somente UM ATRIBUTO
	public Pessoa(float altura) {
		this.nome = "Aluno padrão";
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome == "") {
			throw new RuntimeException("Obrigatorio informar um nome");
		}

		this.nome = nome;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	/***
	 * 
	 * Calculo referente ao IMC
	 * @param valor1
	 * @param valor2
	 * @return retorna o IMC
	 */
	public float calculaIMC(float valor1, float valor2) {
		return valor1 * valor2;
	}

}
