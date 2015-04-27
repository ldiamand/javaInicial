package net.polotecnologico.java.threads;

public class HiloDescarga extends Thread {

	@Override
	public void run() {
		System.out.println("Descargando...");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finalizo la descarga...");
	}
}
