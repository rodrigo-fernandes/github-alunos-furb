package exception.lista11.correcao2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	
	private Scanner scanner;
	
	public Teclado() {
		scanner = new Scanner(System.in);
	}
	
	public int lerInt() {
		while (true) {
			try {
				System.out.println("Digite um número inteiro: ");
				int valor = scanner.nextInt();
				scanner.nextLine();
				return valor;
				
			} catch (Exception e) {
				System.out.println(
					"Valor inválido! Tente novamente.");
				scanner.nextLine();
			}
			
		}
			
	}
	
	public double lerDouble() {
		while (true) {
			try {
				System.out.println("Digite um número double: ");
				double valor = scanner.nextDouble();
				scanner.nextLine();
				return valor;
				
			} catch (Exception erro) {
				System.out.println(erro.getMessage()); 
				System.out.println(
					"Valor inválido! Tente novamente.");
				scanner.nextLine();
			}
			
		}
	}
	
	public boolean lerBoolean() {
		while (true) {
			System.out.println("Digito um booleano: ");
					
			String texto = scanner.nextLine().trim().toLowerCase();
			
			try {
				if (texto.equals("sim") || 
					texto.equals("verdadeiro") ||
					texto.equals("positivo") ||
					texto.equals("true")) {
					
					return true;
				}
				
				if (texto.equals("nao") || 
					texto.equals("não") ||
					texto.equals("negativo") ||
					texto.equals("false")) {
					
					return false;
				}
				
				throw new Exception(
					"Valor esperado para booleano não encontrado");
				
			} catch (Exception e) {
				System.out.println("Erro: valor booleano inválido");
			}
			
		}
	}
	
	public String lerString() {
		System.out.println("Digita um texto: ");
		return scanner.nextLine();
	}
	
	
	
	
	
	
	
	

}
