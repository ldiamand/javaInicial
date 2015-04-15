package net.polotecnologico.polimorfismo;

public class PilaTest {

	public static void main(String[] args) {
		Pila<String> p1 = new Pila<>();
		p1.poner("Luciano");
		p1.poner("Hola");
//		p1.poner(new Integer(1));
		System.out.println(p1.size());
		System.out.println(p1.sacar());
		System.out.println(p1.size());
		System.out.println(p1.sacar());
	}
}
