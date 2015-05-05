import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class ClienteWeb {

	public static void main(String[] args) {
		
		try (Socket soc =
				new Socket("www.yahoo.com", 80)) {
			
			InputStream is = soc.getInputStream();
			OutputStream os = soc.getOutputStream();
			
			PrintWriter pw = new PrintWriter(os, true);
			pw.println("GET / HTTP/1.1");
			pw.println();
			pw.println();
			
			Scanner s = new Scanner(is);
			while (s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			soc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
