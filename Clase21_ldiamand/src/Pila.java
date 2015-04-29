
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
		elementos[indice++] = c;
		notify();
	}
	
	public synchronized char sacar () {
		if (indice == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		return elementos[--indice];
	}
	
	public int size () {
		return indice;
	}

}
