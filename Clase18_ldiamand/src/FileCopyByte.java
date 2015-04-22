import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByte {

	public static void main(String[] args) {
		System.out.println("Copiando...");
		try {
			FileInputStream fis = new FileInputStream("archivo.zip");
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream("destino.zip");
			
				int caracter;
				long start = System.currentTimeMillis();
				while ((caracter = fis.read()) != -1) {
					fos.write(caracter);
				}
				long end = System.currentTimeMillis();
				System.out.println(end - start + "ms");
			} finally {
				if (fos != null) {
					fos.close();
				}
				fis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
