import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Test2 {

	public static void main(String[] args) {
		List<Libro> libros = new ArrayList<Libro>();
		Libro l1 = new Libro("Libro 1", 2000);
		Libro l2 = new Libro("Libro 2", 1644);
		Libro l3 = new Libro("Libro 3", 1990);
		Libro l4 = new Libro("Libro 1", 2000);
		libros.add(l1);
		libros.add(l2);
		libros.add(l3);
		libros.add(l4);
		
		for (Libro libro : libros) {
			System.out.println(libro);
		}

		Collections.sort(libros);
		
		for (Libro libro : libros) {
			System.out.println(libro);
		}
		
		Collections.sort(libros, new AnioComparator());
		
		for (Libro libro : libros) {
			System.out.println(libro);
		}
		
//		List<String> strings = new ArrayList<String>();
//		
//		String s1 = new String("Libro 3");
//		String s2 = new String("Libro 1");
//		String s3 = new String("Libro 2");
//		String s4 = new String("Libro 1");
//		strings.add(s1);
//		strings.add(s2);
//		strings.add(s3);
//		strings.add(s4);
//		
//		for (String string : strings) {
//			System.out.println(string);
//		}
//		
//		Collections.sort(strings);
//		
//		for (String string : strings) {
//			System.out.println(string);
//		}
	}
}
