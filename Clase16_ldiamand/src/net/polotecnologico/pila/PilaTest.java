package net.polotecnologico.pila;

public class PilaTest {

	public static void main(String[] args) {
		Pila<String> p1 = new Pila<>();
		try {
			p1.poner("Luciano");
			p1.poner("Martin");
			p1.poner("Leo");
			p1.poner("Claudia");
		} catch (PilaLlenaException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		
		System.out.println(p1.size());
		System.out.println(p1.sacar());
		System.out.println(p1.sacar());
		System.out.println(p1.sacar());
	}
}
