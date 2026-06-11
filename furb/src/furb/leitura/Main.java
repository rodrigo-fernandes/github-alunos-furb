package furb.leitura;

public class Main {

	public static void main(String[] args) {

		try {
			String arquivoEntrada = "C:\\temp\\dados.txt";
			String arquivoExportado = "C:\\temp\\base.txt";

			// Ler arquivo txt
			ArquivoDados dados = LeitorArquivo.lerArquivo(arquivoEntrada);

			// Salvar objetvo
			ExportarArquivo.salvar(dados, arquivoExportado);

			ArquivoDados dadosCarregados = ImportarArquivo.carregar(arquivoExportado);

			// Exibir conteudo
			System.out.println("Cabecalho");
			System.out.println(dadosCarregados.getEmpresa());

			System.out.println("\nFuncionarios");
			for (Funcionario funcAtual : dadosCarregados.getFuncionarios()) {
				System.out.println(funcAtual);
			}

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
