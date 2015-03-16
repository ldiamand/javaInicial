
public class ArbolTest {

	public static void main(String[] args) {
		Arbol a = new Arbol();
//		a.init(); // no es practico
		System.out.println(a.getAltura());
		System.out.println(a.getTipo());
		
		Arbol a2 = new Arbol(1.5);
		
		Arbol a3 = new Arbol("Palo borracho");
		
	}
}
