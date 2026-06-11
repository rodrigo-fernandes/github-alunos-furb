package furb.leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {
	
	public static ArquivoDados lerArquivo(String caminho) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		
		String linha;
		Empresa empresa = null;
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		while ((linha = br.readLine()) != null) {
			String[] partesStr = linha.split(";");
			
			if (partesStr[0].equals("C")) {
				empresa = new Empresa(partesStr[1], partesStr[2]);
			} else if (partesStr[0].equals("F")) {
				int id = Integer.parseInt(partesStr[1]);
				String nome = partesStr[2];
				double valor = Double.parseDouble(partesStr[3]);
				
				funcionarios.add(new Funcionario(id, nome, valor));
			}
		}
		
		br.close();
		
		return new ArquivoDados(empresa, funcionarios);
		
	}

}
