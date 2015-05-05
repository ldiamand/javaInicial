import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ClienteEcho {

	public static void main(String[] args) {
		try (Socket s = new Socket("localhost", 4444)) {
			Scanner red = new Scanner(s.getInputStream());
			PrintWriter pw =
					new PrintWriter(s.getOutputStream(), true);
			
			Scanner teclado = new Scanner(System.in);
			
			while (teclado.hasNextLine()) {
				String linea = teclado.nextLine();
				pw.println(linea);
				System.out.println(red.nextLine());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
