import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayListTest {

	public static void main(String[] args) {
		List<String> arr1 = new LinkedList<>();
		arr1.add("Luciano");
		arr1.add("Carlos");
		arr1.add("Luciano");
//		arr1.add(new Integer(6));
//		arr1.add(8);
		int cant = arr1.size();
		System.out.println(cant);
		
		String o = arr1.get(3);
		
		for (String object : arr1) {
			System.out.println(object);
		}
		
		arr1.add(2, "Sopa");
		arr1.set(2, "Chau");
		arr1.remove("Luciano");
		
		
	}
}
