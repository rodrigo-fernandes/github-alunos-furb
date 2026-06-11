package abstracao.lista08.correcao.lista02;

import java.util.ArrayList;

public class Empresa {

	private String nome;
	private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Empresa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void incluirFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}
	
	public ArrayList<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
	
	public double calcularCustosSalarios() {
		double total = 0;
		
		for (Funcionario funcionario : getFuncionarios()) {
			total += funcionario.calcularSalario();
		}
		
		return total;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
