import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServicioEcho extends Thread {

	private Socket s;

	public ServicioEcho(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			System.out.println("Cliente conectado...");
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			// String mensaje = "Bienvenidos...\n";
			// os.write(mensaje.getBytes());
			int caracter;
			while ((caracter = is.read()) != -1) {
				if (caracter == '0') {
					os.write("Saliendo...".getBytes());
					break;
				}
				os.write(caracter);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
