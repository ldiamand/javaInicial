package net.polotecnologico.java.threads;

public class HiloConRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Me voy a dormir por 5s");
			try {
				Thread.sleep(5000);
				System.out.println("Uy que buena siesta!");
			} catch (InterruptedException e) {
				System.out.println("Uy me despertaron...");
			}
		}
	}

}
