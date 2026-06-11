package abstracao;

public class Main {


	public static void main(String[] args) {

		System.out.println("Cachorro");
		
		Cachorro dog = new Cachorro();
		dog.dormir();
		dog.fazerSom();
		dog.mover();
		dog.setRaca("caramelo");
		
		System.out.println("\n\n");
		
		System.out.println("Gato");
		
		Gato cat = new Gato();
		cat.dormir();
		cat.fazerSom();
		cat.mover();
		
	}

}
