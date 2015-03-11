
public class IfElseDemo {

	public static void main(String[] args) {
		
//		if (cond. boolean) {
//			// cuerpo del if	
//		}
		
		int a = 10;
		
		if (a > 5) {
			System.out.println("A es mayor a 5");
			System.out.println("Gracias!");
		}
		
//		if (cond. boolean) {
//			// cuerpo del if
//		} else {
//			// cuerpo del else
//		}

		if (a > 5) {
			System.out.println("A es mayor a 5");
		} else {
			System.out.println("No es mayor a 5");
		}
		
//		if (cond. bool 1) {
//			// cuerpo del if 1
//		} else if (cond. bool 2) {
//			// cuerpo del if 2
//		} else if ...
		
		if (a > 5) {
			System.out.println("A es mayor a 5");
		} else if (a < 5) {
			System.out.println("A es menor a 5");
		} else if (a == 5) {
			System.out.println("A es igual a 5");
		}
		
		if (a > 5) {
			System.out.println("A es mayor a 5");
		} else if (a < 5) {
			System.out.println("A es menor a 5");
		} else {
			System.out.println("A es igual a 5");
		}
		
		int i = 100;
		if (i > 100)
			if (i == 100) 
				System.out.println("A");
		else
			System.out.println("B");
		
		boolean b = true;
		
		if (b = true) { // OJO!
			System.out.println("Rebuscado!");
		}
	}
}
