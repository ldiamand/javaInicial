
public class ArregloTipoPrimitivo {

	public static void main(String[] args) {
		int [] arr1 = new int[3];
		
		System.out.println(arr1[1]);
		
		arr1[0] = 1;
		
		int cant = arr1.length;
		
		System.out.println(cant);
		
//		arr1.length = 6; // NC
		
		System.out.println(arr1[67]);
	}
}
