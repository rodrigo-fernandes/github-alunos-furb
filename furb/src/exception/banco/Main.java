package exception.banco;

public class Main {

	public static void main(String[] args) {
		
	ContaBancaria contaBancaria = new ContaBancaria("Joao", 1000);
	
	contaBancaria.exibirSaldo();
	
	System.out.println();
	
	contaBancaria.depositar(500);
	
	contaBancaria.depositar(-50);
	
	System.out.println();
	
	contaBancaria.sacar(300);
	
	contaBancaria.sacar(2000);
	
	contaBancaria.sacar(-10);
	
	System.out.println();
	contaBancaria.exibirSaldo();

	}

}
