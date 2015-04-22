import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBuffByte {

	public static void main(String[] args) {
		System.out.println("Copiando...");
		try {
			FileInputStream fis = new FileInputStream("archivo.zip");
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream("destino.zip");
			
				int cant;
				byte [] buff = new byte[4096];
				long start = System.currentTimeMillis();
				while ((cant = fis.read(buff)) != -1) {
					fos.write(buff, 0, cant);
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
