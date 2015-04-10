package net.polotecnologico.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Pila <T> {

	private List<T> elems;
	
	public Pila () {
		elems = new ArrayList<T>();
	}
	
	public void poner (T e) {
		elems.add(e);
	}
	
	public T sacar () {
		return elems.remove(elems.size() - 1);
	}
	
	public int size () {
		return elems.size();
	}

}
