package furb.lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		System.out.println("Informe o nome do funcionário:");
		String nome = input.nextLine();
		
		System.out.println("Informe o salário:");
		double salario = Double.parseDouble(input.nextLine());
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nome);
		funcionario.setSalario(salario);
		

		DecimalFormat decimalFormat = new DecimalFormat("R$ 0.00");  
		
		System.out.println("O IRRF do funcionário é: "
				+ decimalFormat.format(funcionario.calcularIrpf()));
		
		
	}

}
