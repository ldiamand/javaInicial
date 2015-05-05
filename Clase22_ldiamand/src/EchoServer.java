import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) {
		System.out.println("Levantando el servicio...");
		try (ServerSocket ss = new ServerSocket(4444)) {
			while (true) {
				System.out.println("Esperando un cliente...");
				Socket s = ss.accept();
				ServicioEcho se = new ServicioEcho(s);
				se.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
