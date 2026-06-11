package lista10;

public class Cachorro implements Animal {

	@Override
	public void fazerSom() {
		System.out.println("Latindo");
	}

	@Override
	public void mover() {
		System.out.println("Correndo");
	}

	@Override
	public int quantidadePatas(int qnt) {
		return qnt;
	}

}
