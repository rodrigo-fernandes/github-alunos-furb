package lista10;

public class Gato implements Animal {

	@Override
	public void fazerSom() {
		System.out.println("Miando");
	}
	
	@Override
	public void mover() {
		System.out.println("Pulando");
	}

	@Override
	public int quantidadePatas(int qnt) {
		return qnt;
	}
}
