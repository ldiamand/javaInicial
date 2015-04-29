import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Consumidor extends Thread {

	private Pila pila;

	private static final NumberFormat FORMATTER = new DecimalFormat("000");

	public Consumidor(Pila pila, String nombre) {
		super(nombre);
		this.pila = pila;
	}

	@Override
	public void run() {
		for (int i = 0; i < 200; i++) {
			char caracter = pila.sacar();
			try {
				int ms = (int) (Math.random() * 10);
				System.out.println(Thread.currentThread().getName()
						+ "\tSACO el caracter '" + caracter + "' [" + ms
						+ "ms, " + FORMATTER.format(i + 1) + ", " + pila.size()
						+ "]");
				Thread.sleep(ms);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
