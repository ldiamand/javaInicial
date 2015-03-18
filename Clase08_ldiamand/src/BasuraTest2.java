
public class BasuraTest2 {

	public static void main(String[] args) {
		String nombre = "Luciano";
		for (int i = 0; i < 1000000; i++) {
			new Basura(nombre + i);
//			System.gc(); // Puedo forzar la ejecución (si el GC quiere)!
		}
	}
}
