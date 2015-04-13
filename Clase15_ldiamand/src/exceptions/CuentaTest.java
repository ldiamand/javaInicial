package exceptions;

public class CuentaTest {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta(150);
		try {
			System.out.println(c1.extraer(100));
		} catch (SinSaldoException e) {
			e.printStackTrace();
		}
		System.out.println(c1.extraerDolares(100));
		
	}
}
