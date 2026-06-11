package abstracao.lista08.correcao.lista02;

import java.util.ArrayList;

public class Programador extends Funcionario {

	private ArrayList<String> linguagens = new ArrayList<String>();
	
	public Programador(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	public void incluirLinguagem(String linguagem) {
		linguagens.add(linguagem);
	}

	public void removerLinguagem(String linguagem) {
		linguagens.remove(linguagem);
	}
	
	@Override
	public double calcularSalario() {
		double totalSalario = getSalarioBase();
			
		if (conheceJava()) {
			totalSalario += (getSalarioBase() * 20)/100;
		}
		
		return totalSalario;
	}
	
	
	public ArrayList<String> getLinguagens() {
		return linguagens;
	}

	private boolean conheceJava() {
		for (String linguagem : getLinguagens()) {
			if (linguagem.equalsIgnoreCase("Java")) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
