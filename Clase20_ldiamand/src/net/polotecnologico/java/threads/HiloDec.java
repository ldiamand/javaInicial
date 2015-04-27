package net.polotecnologico.java.threads;

public class HiloDec extends Thread {

	private Contador cont;
	
	public void setCont(Contador cont) {
		this.cont = cont;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			cont.dec();
		}
	}
}
