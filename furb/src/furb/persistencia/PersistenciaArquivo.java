package furb.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PersistenciaArquivo {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("C:\\furb\\dados\\dados.bin");
		FileInputStream fis = null;

		try {
		    fis = new FileInputStream(arquivo);

		    int dado;
		    while ((dado = fis.read()) != -1) {
		        System.out.println( dado );
		    }
		} finally {
		    if (fis != null)
		        fis.close();
		}

		
	}
	
}
