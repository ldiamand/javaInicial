package net.polotecnologico.clase12;

public class Cuadrado implements Figura {

	private int lado;
	
	public Cuadrado (int lado) { //, int color) {
//		super(color);
		this.lado = lado;
	}
	
	public double area() {
		return lado * lado;
	}

}
