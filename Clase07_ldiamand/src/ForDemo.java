
public class ForDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}
		
		eti2:
			
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		
		
		eti1: for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j - 1) {
					System.out.println("Hola");
					break eti1;
				}
			}
		}
		
		eti3:
			System.out.println("hola");
	}
}
