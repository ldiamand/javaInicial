import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> elementos = new TreeSet<>();
		elementos.add("Hola");
		elementos.add("Chau");
		elementos.add("Pepe");
		elementos.add("Ahhh");
		
		for (String string : elementos) {
			System.out.println(string);
		}
		
		TreeSet<Libro> elementos2 = new TreeSet<>(new AnioComparator());
		elementos2.add(new Libro("Libro 1", 2000));
		elementos2.add(new Libro("Libro 4", 1999));
		elementos2.add(new Libro("Libro 3", 2001));
		elementos2.add(new Libro("Libro 2", 2009));
		
		for (Libro libro : elementos2) {
			System.out.println(libro);
		}
		
		Collections.synchronizedList(new ArrayList<String>());
	}
}
