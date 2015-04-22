import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyChar {

	public static void main(String[] args) {
		System.out.println("Copiando...");
		try {
			FileReader fr = new FileReader("archivo.zip");
			FileWriter fw = null;
			try {
				fw = new FileWriter("destino.zip");
			
				int caracter;
				long start = System.currentTimeMillis();
				while ((caracter = fr.read()) != -1) {
					fw.write(caracter);
				}
				long end = System.currentTimeMillis();
				System.out.println(end - start + "ms");
			} finally {
				if (fw != null) {
					fw.close();
				}
				fr.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
