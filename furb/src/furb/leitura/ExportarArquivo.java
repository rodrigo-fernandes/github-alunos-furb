package furb.leitura;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExportarArquivo {

	public static void salvar(ArquivoDados dados, String caminho) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(caminho));
		oos.writeObject(dados);
		oos.close();

	}

}
