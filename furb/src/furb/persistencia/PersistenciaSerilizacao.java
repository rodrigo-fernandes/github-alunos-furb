package furb.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersistenciaSerilizacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("C:\\furb\\dados\\dados.txt");
		
		String objeto1;
		ContaBancaria objeto2;
		Veiculo objeto3;

		
//		Seriualizacao/grava os dados para o arquivo
		try (FileOutputStream fos = new FileOutputStream(f);
		     ObjectOutputStream o = new ObjectOutputStream(fos)) {
		    o.writeObject("Boa noite");
		    o.writeObject(new ContaBancaria("AAAAAA","Lucas", 300));
		    o.writeObject(new Veiculo("MIE-3932","Anderson"));
		}
		
		try (FileInputStream fis = new FileInputStream(f);
		     ObjectInputStream ois = new ObjectInputStream(fis)) {
		    objeto1 = (String) ois.readObject();
		    objeto2 = (ContaBancaria) ois.readObject();
		    objeto3 = (Veiculo) ois.readObject();
		}


		
	}
	
}
