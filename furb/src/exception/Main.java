package exception;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int contador = 0;
		Scanner saScanner = new Scanner(System.in);
		while(true) {
			contador++;
			try {
				int numero = obterValor();
				System.out.println("Numero informado: " + numero );
				break;
			} catch (NumberFormatException e) {
				System.out.println("Valor invalido. Finalizado!");
			} finally {
				contador = 0;
				saScanner.close();
			}
			
			
		}
		
		System.out.println("Fim");
		
	}

	
	public static int obterValor() {
		Scanner input = new Scanner(System.in);
		int valor = Integer.parseInt(input.nextLine());
		return valor;
	}
	
}
