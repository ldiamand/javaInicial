
public class MazoTest {

	public static void main(String[] args) {
		Mazo m = new Mazo();
		for (int i = 0; i < Mazo.CANT_CARTAS + 10; i++) {
			Carta c = m.getCarta();
			if (c != null) {
				System.out.println(c.getCartaImprimir());
			} else {
				System.out.println("No hay mas cartas");
			}
		}
	}

}
