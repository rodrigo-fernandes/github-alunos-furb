package furb.leitura;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ImportarArquivo {

	
	public static ArquivoDados carregar(String caminho) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(caminho));
		ArquivoDados dados = (ArquivoDados) ois.readObject();
		ois.close();

		return dados;
	}

}
