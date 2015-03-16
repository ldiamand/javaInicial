
public class ForEachDemo {

	public static void main(String[] args) {
		// foreach (1.5 >=)
		String [] arr = { "Uno", "Dos", "Tres", "Cuatro" };
		
		for (int i = 0; i < arr.length; i++) {
			if ( i == 5) {
				i = arr.length; // NUNCA! KK
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (String s : arr) {
			System.out.println(s);
		}
		
	}
}
