package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo05 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("archivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
