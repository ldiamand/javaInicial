package net.polotecnologico.java.threads;

public class HiloInc extends Thread {

	private Contador cont;
	
	public HiloInc(Contador cont) {
		this.cont = cont;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			cont.inc();
		}
	}
}
