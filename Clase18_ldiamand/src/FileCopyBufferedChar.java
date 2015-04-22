import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyBufferedChar {

	public static void main(String[] args) {
		System.out.println("Copiando...");
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("origen.txt"));
			
			BufferedWriter bw = null;
			try {
				bw = new BufferedWriter(
					new FileWriter("destino.txt"));
			
				int caracter;
				long start = System.currentTimeMillis();
				while ((caracter = br.read()) != -1) {
					bw.write(caracter);
				}
				long end = System.currentTimeMillis();
				System.out.println(end - start + "ms");
			} finally {
				if (bw != null) {
					bw.close();
				}
				bw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
