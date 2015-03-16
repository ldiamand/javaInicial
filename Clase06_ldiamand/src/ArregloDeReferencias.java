
public class ArregloDeReferencias {

	public static void main(String[] args) {
		String [] arr1 = new String[3];
		
		System.out.println(arr1[1]);
		
		arr1[0] = "Hola";
		
		String s = new String("Luciano"); // HORRIBLE!
		String s2 = "Luciano";
		
		arr1[1] = s2;
		
	}
}
