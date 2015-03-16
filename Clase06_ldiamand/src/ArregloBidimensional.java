

public class ArregloBidimensional {

	public static void main(String[] args) {
		int [][] arr2 = new int[2][3];
		
		int filas = arr2.length;
		System.out.println("Filas: " + filas);

		int column = arr2[1].length;
		System.out.println("Columnas: " + column);
		
		arr2[0][1] = 10;
		
		System.out.println(arr2[0][1]);
		
		int [][] arr3 = new int[2][];
		
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		
		arr3[0] = new int[2];
		
		System.out.println(arr3[0][0]);
		
//		arr3[1] = new int[3];
		arr3[1] = arr3[0];
		
		arr3[0][1] = 15;
		
		System.out.println(arr3[1][1]);
		
	}
}
