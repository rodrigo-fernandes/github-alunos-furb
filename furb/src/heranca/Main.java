package heranca;

public class Main {

	public static void main(String[] args) {

		CalculadoraCientifica cientifica = new CalculadoraCientifica();

		Double valorTaxaIOF = cientifica.calculaTaxaIOF(10.0, 20.0, 3); 
		System.out.println("Valor da taxa é: " 
				+ valorTaxaIOF);
		
		Double valorSomado = cientifica.somar(10.0, 20.0);
		Double valorSubtraido = cientifica.subtrair(10.0, 5.0);
		
		System.out.println("Valor somado é: "+ valorSomado);
		System.out.println("Valor subtraido é: "+ valorSubtraido);
		
		CalculadoraPolishop polishop = new CalculadoraPolishop();
		polishop.somar(50.0, 50.0);
		polishop.calculaTaxaIOF(50.0, 10.0, 5);
		
		Calculadora calculadora = new Calculadora();
		calculadora.somar(10.0, 50.0);

	}

}
