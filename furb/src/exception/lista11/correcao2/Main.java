package exception.lista11.correcao2;

public class Main {

	public static void main(String[] args) {

		Teclado input = new Teclado();
		
		int numero = input.lerInt();
		System.out.println("Inteiro: " + numero);

		double valor = input.lerDouble();
		System.out.println("Double: " + valor);

		boolean isBoolean = input.lerBoolean();
		System.out.println("Boolean: " + isBoolean);

		String texto = input.lerString();
		System.out.println("String: " + texto);
		
	}

}
