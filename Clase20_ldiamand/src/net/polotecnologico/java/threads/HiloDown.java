package net.polotecnologico.java.threads;

public class HiloDown extends Thread {

	@Override
	public void run() {
		for (int i = 0; i > -1000; i--) {
			System.out.println(i);
		}
	}
}
