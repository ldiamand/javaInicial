
public class OperadoresLogicos {

	public static void main(String[] args) {
		// & (and circuito largo)
		// && (and circuito corto)
		int a = 1;
		int b = 2;
		boolean b1 = a > 1 && b < 10;
		boolean b2 = a > 1 & b < 10;
		
		boolean b3 = b < 10 || a > 1;
		boolean b4 = b < 10 | a > 1;
		
		boolean b5 = !b3;
		System.out.println(b5);
		
		
	}
}
