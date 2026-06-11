package lista10;

public interface Animal {
	
	void fazerSom();
	void mover();
	int quantidadePatas(int qnt);
	
	default void dormir() {
		System.out.println("Dormindo");
	}

}
