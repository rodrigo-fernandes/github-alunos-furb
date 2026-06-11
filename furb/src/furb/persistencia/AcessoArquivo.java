package furb.persistencia;

import java.io.File;

public class AcessoArquivo {

	public static void main(String[] args) {
		
		// acessa o diretorio
		File diretorio = new File("C:\\furb\\dados\\dados.txt");

		File[] conteudoDiretorio = diretorio.listFiles();
		for (File item : conteudoDiretorio) {
		    if (item.isDirectory()) {
		        System.out.println("Diretório: " + 
		        		item.getName());
		    } else {
		        System.out.println("Arquivo " + item.getName() 
		        	+ " tem " + item.length() + " bytes");
		    }
		}


	}

}
