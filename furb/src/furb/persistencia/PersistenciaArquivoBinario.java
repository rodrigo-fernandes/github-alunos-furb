package furb.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersistenciaArquivoBinario {

	public static void main(String[] args) throws IOException {
		
		// gravar/alterar dentro do arquivo
//		File arquivo = new File("C:\\furb\\dados\\dados.dat");
//		FileOutputStream fos = new FileOutputStream(arquivo, true);
//		fos.write(65);
//		fos.close();
		
		
		File arquivo = new File("C:\\furb\\dados\\dados.dat");
		FileInputStream fis = new FileInputStream(arquivo);
		int dado;

		while (true) {
		    dado = fis.read();
		    if (dado != -1) {
		        System.out.println(dado);
		    } else {
		        break;
		    }
		}
		fis.close();

		System.out.println("Terminou");


		
	}
	
}
