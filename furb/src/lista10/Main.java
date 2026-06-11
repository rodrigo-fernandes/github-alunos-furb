package lista10;

public class Main {
	
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		System.out.println("Cachorro");
		cachorro.fazerSom();
		cachorro.mover();
		cachorro.dormir();
		
		System.out.println("Gato");
		Gato gato = new Gato();
		gato.fazerSom();
		gato.mover();
		gato.dormir();
	}

}
