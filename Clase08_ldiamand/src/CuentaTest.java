
public class CuentaTest {

	public static void main(String[] args) {
		Cuenta.setDolar(11);
		
		Cuenta c1 = new Cuenta();
		System.out.println(c1.consultar());
		c1.extraer(1000);
		System.out.println(c1.consultar());
		c1.extraer(10000);
		System.out.println(c1.consultar());
		c1.depositar(5000);
		System.out.println(c1.consultar());
		
		System.out.println(Cuenta.getDolar());
		Cuenta.setDolar(10);
		System.out.println(Cuenta.getDolar());
		
		c1.extraerDolares(1400);
		System.out.println(c1.consultar());
		
		Cuenta c2 = new Cuenta();
		System.out.println(Cuenta.getDolar());
		
	}
}
