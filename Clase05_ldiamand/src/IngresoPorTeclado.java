import java.util.Scanner;

public class IngresoPorTeclado {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String linea = s.nextLine();
		System.out.println(linea.equals("luciano"));
		System.out.println(linea == "luciano");
	}

}
