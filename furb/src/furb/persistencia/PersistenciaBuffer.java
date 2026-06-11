package furb.persistencia;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PersistenciaBuffer {

	public static void main(String[] args) throws IOException {
		
		
		File arquivo = new File("C:\\furb\\dados\\dados.dat");
		FileInputStream fis = new FileInputStream(arquivo);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		dis.close();

		
	}
	
}
