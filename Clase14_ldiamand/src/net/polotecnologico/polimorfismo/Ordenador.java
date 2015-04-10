package net.polotecnologico.polimorfismo;

public class Ordenador {

	public static void ordenar(Ordenable[] ords) {
		for (int i = 0; i < ords.length - 1; i++) {
			for (int j = i + 1; j < ords.length; j++) {
				if (ords[i].compareTo(ords[j]) > 0) {
					Ordenable tmp = ords[i];
					ords[i] = ords[j];
					ords[j] = tmp;
				}
			}
		}
	}
	
	private Ordenador() {
		// HELPER!
	}

}
