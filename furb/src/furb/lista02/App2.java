package furb.lista02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {

		Funcionario[] listaFuncionario = new Funcionario[5];

		Scanner inputDados = new Scanner(System.in);

		System.out.println("---------- CADASTRO DE FUNCIONARIOS ----------");
		for (int i = 0; i < listaFuncionario.length; i++) {

			System.out.println("Informe o nome do funcionário:");
			String nome = inputDados.nextLine();

			System.out.println("Informe o salário:");
			double salario = Double.parseDouble(inputDados.nextLine());

			Funcionario funcionario = new Funcionario();
			funcionario.setNome(nome);
			funcionario.setSalario(salario);

			listaFuncionario[i] = funcionario;

		}

		DecimalFormat decimalFormat = new DecimalFormat("R$ 0.00");

		for (int i = 0; i < listaFuncionario.length; i++) {
			System.out.println("--------- Lista de funcionarios ---------");
			System.out.println("Nome: " + listaFuncionario[i].getNome());
			System.out.println("Salario: " + listaFuncionario[i].getSalario());
			System.out.println("IRRF: " + decimalFormat.format(listaFuncionario[i].calcularIrpf()));
		}

	}

}
