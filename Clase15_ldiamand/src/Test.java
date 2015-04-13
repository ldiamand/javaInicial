import java.util.HashSet;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		Set<Libro> libros = new HashSet<Libro>();
		Libro l1 = new Libro("Libro 1", 2000);
		System.out.println(l1.hashCode());
		Libro l2 = new Libro("Libro 2", 1644);
		System.out.println(l2.hashCode());
		Libro l3 = new Libro("Libro 3", 1990);
		System.out.println(l3.hashCode());
		Libro l4 = new Libro("Libro 1", 2000);
		System.out.println(l4.hashCode());
		libros.add(l1);
		libros.add(l2);
		libros.add(l3);
		libros.add(l4);
		
		for (Libro libro : libros) {
			System.out.println(libro + " " + libro.hashCode());
		}
		
		Set<String> strings = new HashSet<String>();
		
		String s1 = new String("Libro 1");
		System.out.println(s1.hashCode());
		String s2 = new String("Libro 2");
		System.out.println(s2.hashCode());
		String s3 = new String("Libro 3");
		System.out.println(s3.hashCode());
		String s4 = new String("Libro 1");
		System.out.println(s4.hashCode());
		strings.add(s1);
		strings.add(s2);
		strings.add(s3);
		strings.add(s4);
		
		for (String string : strings) {
			System.out.println(string);
		}
	}
}
