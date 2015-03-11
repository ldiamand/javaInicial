
public class SwitchDemo {

	public static void main(String[] args) {
		//       byte, short, int, char, enum (1.5), String(1.7)
		// switch (exp. int) {   
		//     case Const1:
		//         ...
		//     case Const2:
		//         ...
		//     case ConstN:
		//         ...

		int i = 2;
		switch (i) {
			case 1:
				System.out.println("Uno");
			case 2:
				System.out.println("Dos");
			case 3:
				System.out.println("Tres");
		}
		
		switch (i) {
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Dos");
				break;
			case 3:
				System.out.println("Tres");
				break;
		}
		
		i = 4;
		switch (i) {
			case 1:
				System.out.println("Uno");
			case 2:
				System.out.println("Dos");
			case 3:
				System.out.println("Tres");
			default: 
				System.out.println("No es ni 1 ni 2 ni 3");
		}
		
		switch (i) {
			case 1:
				System.out.println("Uno");
			default: 
				System.out.println("No es ni 1 ni 2 ni 3");
			case 2:
				System.out.println("Dos");
			case 3:
				System.out.println("Tres");
		}
		
		char c = 'C', d = 'D';
		switch (c) {
			case 'A':
				System.out.println("Es a");
//			case d:
//				System.out.println("Es la variable d");
			case 'C':
				System.out.println("Es c");
		}
		
		switch (c) {
			case 65:
			case 66:
			case 65535:
//			case 65536:
		}
		
	}
	
}
