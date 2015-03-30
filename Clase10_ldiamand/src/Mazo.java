
public class Mazo {

	public static final int CANT_CARTAS = 48;
	
	private Carta [] cartas;
	
	private int indice;
	
	public Mazo() {
		reiniciar();
	}
	
	public void reiniciar() {
		cartas = new Carta[CANT_CARTAS];
		indice = CANT_CARTAS;
		int cont = 0;
		for (Palo palo : Palo.values()) {
			for (Numero numero : Numero.values()) {
				cartas[cont++] = new Carta(palo, numero);
			}
		}
	}
	
	public Carta getCarta() {
		if (indice >= 1) {
			int azar = (int) (Math.random() * indice--);
			Carta tmp = cartas[azar];
			cartas[azar] = cartas[indice];
			cartas[indice] = tmp;
			return tmp;
		}
		return null;
	}

}
