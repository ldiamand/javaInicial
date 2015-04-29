import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Productor extends Thread {

	private Pila pila;

	private static final NumberFormat FORMATTER = new DecimalFormat("000");

	public Productor(Pila pila, String nombre) {
		super(nombre);
		this.pila = pila;
	}

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			char caracter = (char) ((int) (Math.random() * 26) + 'A');
			pila.poner(caracter);
			try {
				int ms = (int) (Math.random() * 10);
				System.out.println(Thread.currentThread().getName()
						+ "\tPUSO el caracter '" + caracter + "' [" + ms
						+ "ms, " + FORMATTER.format(i + 1) + ", " + pila.size()
						+ "]");
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
