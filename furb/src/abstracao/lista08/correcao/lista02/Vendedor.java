package abstracao.lista08.correcao.lista02;

import java.util.ArrayList;

public class Vendedor extends Funcionario {

	private double percentualComissao;
	private ArrayList<Venda> vendas = new ArrayList<Venda>();

	public Vendedor(String nome, double salarioBase, double percentualComissao) {
		super(nome, salarioBase);
		this.percentualComissao = percentualComissao;

	}

	public double getPercentualComissao() {
		return percentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void incluirVendar(Venda venda) {
		vendas.add(venda);
	}
	
	@Override
	public double calcularSalario() {
		double totalVenda = 0;
		
		for (Venda venda : getVendas()) {
			totalVenda += venda.getValor();
		}
		
		
		return getSalarioBase() + ((totalVenda * getPercentualComissao())/100);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
