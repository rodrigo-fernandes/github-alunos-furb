package abstracao.lista08.correcao.lista01;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.println("*****************************");
		System.out.println("Escolha a geométrica que deseja criar: ");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retangulo");
		System.out.println("3 - Triangulo");
		System.out.println("4 - Círculo");
		System.out.println("*****************************");
		
		int opcaoSelecionada = Integer.parseInt(input.nextLine());
		
		Figura figuraGeometrica = null;
		
		switch (opcaoSelecionada) {
		case 1:
			System.out.println("Informe a medida do quadrado:");
			int medida = Integer.parseInt(input.nextLine());
			
			figuraGeometrica = new Quadrado(medida);
			
			break;
		case 2:
			System.out.println("Informe a largura do retangulo");
			int largura = Integer.parseInt(input.nextLine());
			
			System.out.println("Informe a altura do retangulo");
			int altura = Integer.parseInt(input.nextLine());
			
			figuraGeometrica = new Retangulo(largura, altura);
			
			break;
		case 3:
			System.out.println("Informe a medida do lado 1 do triangulo");
			int lado1 = Integer.parseInt(input.nextLine());
			
			System.out.println("Informe a medida do lado 2 do triangulo");
			int lado2 = Integer.parseInt(input.nextLine());

			System.out.println("Informe a medida do lado 3 do triangulo");
			int lado3 = Integer.parseInt(input.nextLine());
			
			figuraGeometrica = new Triangulo(lado1, lado2, lado3);
			break;
		case 4:
			System.out.println("Informe o raio do Círculo");
			
			int raio = Integer.parseInt(input.nextLine());
			
			figuraGeometrica = new Circulo(raio);
			
			break;
		}

		System.out.println("*********************");
		System.out.println("A area calculada é de: " 
						+ figuraGeometrica.calcularArea());
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
