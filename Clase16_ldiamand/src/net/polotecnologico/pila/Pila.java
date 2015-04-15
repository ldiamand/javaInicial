package net.polotecnologico.pila;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {

	private List<T> elementos;
	
	private final int max;
	
	private static final int MAX_DEFAULT = 2;
	
	public Pila () {
		this(MAX_DEFAULT);
	}
	
	public Pila (int max) {
		elementos = new ArrayList<>(max);
		this.max = max;
	}
	
	public void poner (T elemento) throws PilaLlenaException {
		if (size() < max) {
			elementos.add(elemento);
		} else {
			throw new PilaLlenaException("No hay mas lugar");
		}
	}
	
	public T sacar() {
		if (size() > 0) {
			return elementos.remove(size() - 1);
		}
		throw new PilaVaciaException("No hay mas elementos");
	}
	
	public int size () {
		return elementos.size();
	}
	
}
