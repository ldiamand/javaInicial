package exceptions;

public class Ejemplo03 {


	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		try {
			int result = j / i;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Fin");
	}
	
}
