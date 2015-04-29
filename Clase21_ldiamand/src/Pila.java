
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
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		elementos[indice++] = c;
		notify();
	}
	
	public synchronized char sacar () {
		while (indice == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		notify();
		return elementos[--indice];
	}
	
	public int size () {
		return indice;
	}

}
