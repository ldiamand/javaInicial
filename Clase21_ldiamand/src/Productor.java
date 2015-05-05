import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Productor extends Thread {

	private Pila pila;

	private int cant;
	
	private static final NumberFormat FORMATTER = new DecimalFormat("000");

	public Productor(Pila pila) {
		this.pila = pila;
		this.cant = 200;
	}
	
	public Productor(Pila pila, String nombre) {
		this(pila);
		setName(nombre);
	}

	public Productor(Pila pila, String nombre, int cant) {
		this(pila, nombre);
		this.cant = cant;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < cant; i++) {
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
