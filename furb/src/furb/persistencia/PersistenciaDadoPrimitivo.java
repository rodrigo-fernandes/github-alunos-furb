package furb.persistencia;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PersistenciaDadoPrimitivo {

	
	public static void main(String[] args) throws IOException {

//		diretório onde está o nosso arquivo
		File f = new File("C:\\furb\\dados\\dados.bin");
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		double preco = dis.readDouble();
		boolean bool = dis.readBoolean();
		String instituicao = dis.readUTF();
		dis.close();


	}
}












