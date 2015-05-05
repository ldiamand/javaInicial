
public class Pila {

	private char [] elementos;
	
	private int indice;
	
	private static final int MAX = 10;
	
	public Pila () {
		elementos = new char[MAX];
	}
	
	public Pila (int cant) {
		elementos = new char[cant];
	}
	
	public synchronized void poner (char c) {
		while (indice == elementos.length) {
			try {
				System.out.println("Esperando: " + Thread.currentThread().getName());
				wait();
				System.out.println("Saliendo: " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (indice == 0) {
			notifyAll();
		}
		elementos[indice++] = c;
	}
	
	public synchronized char sacar () {
		while (indice == 0) {
			try {
				System.out.println("Esperando: " + Thread.currentThread().getName());
				wait();
				System.out.println("Saliendo: " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				
			}
		}
		if (indice == elementos.length) {
			notifyAll();
		}
		return elementos[--indice];
	}
	
	public int size () {
		return indice;
	}

}
