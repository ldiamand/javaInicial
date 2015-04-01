import java.util.Scanner;


public class Juego {

	private Mazo m;
	
	public Juego() {
		m = new Mazo();
	}
	
	public void comenzar() {
		String opcion;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("Quiere una carta?");
			opcion = s.nextLine();
			if ("N".equals(opcion)) {
				break;
			}
			Carta jugador = m.getCarta();
			if (jugador == null) {
				System.out.println("Mazo nuevo!!!!!!!!!!!!!!");
				m.reiniciar();
				jugador = m.getCarta();
			}
			System.out.println("Tu carta: " + 
					jugador.getCartaImprimir());
			Carta maquina = m.getCarta();
			System.out.println("Carta maquina: " 
					+ maquina.getCartaImprimir());
			
//			if (jugador.getNumero().ordinal() > maquina.getNumero().ordinal()) {
//				System.out.println("Ganaste!");
//			} else if (jugador.getNumero().ordinal() < maquina.getNumero().ordinal()) {
//				System.out.println("PERDEDOOOOOOOORRRRR!");
//			} else {
//				System.out.println("Empataron");
//			}
			
			int comp = jugador.getNumero().compara(maquina.getNumero());
			if (comp > 0) {
				System.out.println("Ganaste!");
			} else if (comp < 0) {
				System.out.println("PERDEDOOOOOOOORRRRR!");
			} else {
				System.out.println("Empataron");
			}
			
			Carta ancho = new Carta(Palo.BASTO, Numero.UNO);
				
		} while (true);
	}

}
