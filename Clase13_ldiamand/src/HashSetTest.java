import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> lista = new HashSet<String>();
		System.out.println(lista.add("Uno"));
		System.out.println(lista.add("Dos"));
		System.out.println(lista.add("Dos"));
		System.out.println(lista.add("Tres"));
		System.out.println(lista.add("Cuatro"));
		System.out.println(lista.add("Cinco"));
		System.out.println(lista.size());
		
//		for (String string : lista) {
//			System.out.println(string);
//		}
		
		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
