package net.polotecnologico.java.threads;

public class Ejemplo01Test {

	public static void main(String[] args) {
		HiloUp h1 = new HiloUp();
		HiloDown h2 = new HiloDown();
		h1.start();
		h2.start();
		System.out.println("Fin");
	}
}
