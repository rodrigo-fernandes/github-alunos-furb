package abstracao;

public class Cachorro extends Animal {

	private String raca;
	
	@Override
	public void fazerSom() {
		System.out.println("O cachorro late");
	}

	@Override
	public void mover() {
		System.out.println("O cachorro corre");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	

}
