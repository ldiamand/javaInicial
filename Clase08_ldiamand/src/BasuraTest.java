
public class BasuraTest {

	public static void main(String[] args) {
		Basura [] b = new Basura[10000000];
		String nombre = "Luciano";
		for (int i = 0; i < b.length; i++) {
			b[i] = new Basura(nombre + i);
		}
	}
}
