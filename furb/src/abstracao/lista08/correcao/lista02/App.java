package abstracao.lista08.correcao.lista02;

import java.text.DecimalFormat;

public class App {

	public static void main(String[] args) {

		Empresa empresa = new Empresa("FURB");
		
		Vendedor vendedor = new Vendedor("Joao", 1680, 10);
		
		vendedor.incluirVendar(new Venda(200));
		vendedor.incluirVendar(new Venda(100));
		
		empresa.incluirFuncionario(vendedor);
		
		vendedor = new Vendedor("Mariaaaaa", 1700, 7);
		vendedor.incluirVendar(new Venda(500));
		vendedor.incluirVendar(new Venda(350));
		vendedor.incluirVendar(new Venda(280));
		
		empresa.incluirFuncionario(vendedor); 
		
		Programador programador = new Programador("Joséeeee", 600);
		programador.incluirLinguagem("C");
		programador.incluirLinguagem("Java");

		empresa.incluirFuncionario(programador);
		
		programador = new Programador("Testeeeee", 1200);
		programador.incluirLinguagem("Java");
		programador.incluirLinguagem("C#");
		
		empresa.incluirFuncionario(programador);
		
		Funcionario funcionario = new Funcionario("Silvino", 2000);
		empresa.incluirFuncionario(funcionario);
		
		
		DecimalFormat df = new DecimalFormat("R$ 0.00");
		System.out.println("Custo total com salários "+ empresa.calcularCustosSalarios());
		
		System.out.println("******** Relacao de funcionarios ********");
		
		for(Funcionario funcionarioAtual : empresa.getFuncionarios()) {
			System.out.println("Nome é: " + funcionarioAtual.getNome() +
					" salário é: " + funcionarioAtual.getSalarioBase());
		}
		
		
		System.out.println("******** Relacao de vendedores ********");
		for(Funcionario funcionarioAtual : empresa.getFuncionarios()) {
			
			if (funcionarioAtual instanceof Vendedor) {
				Vendedor vendedorAtual = (Vendedor) funcionarioAtual;
				System.out.println("Nome: "+ vendedorAtual.getNome() +
						"% Commisao: "+ vendedorAtual.getPercentualComissao());
			}
			
		}
		
		System.out.println("******** Relacao de programadores ********");
		for(Funcionario funcionarioAtual : empresa.getFuncionarios()) {
			if (funcionarioAtual instanceof Programador) {
				Programador p = (Programador) funcionarioAtual;
				System.out.println("Nome: " + p.getNome() +
						" Lingagues: "+ p.getLinguagens());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
