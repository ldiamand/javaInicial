package net.polotecnologico.java.threads;

public class HiloUp extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("\t" + i);
		}
	}

}
