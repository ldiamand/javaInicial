
public class PoolStrings {

	public static void main(String[] args) {
		String s1;
//		System.out.println(s1);
		new String("Inutil!");
		s1 = new String("Util!");
		String s2 = s1;
		s1 = new String("Chau");
		s1 = null;
		
		String s3 = "Hola";
		String s4 = "Chau";
		String s5 = new String("Chau");
		String s6 = "Hola";
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s5));
		System.out.println(s3.equals(s6));
		
		System.out.println(s3 == s4);
		System.out.println(s4 == s5);
		System.out.println(s3 == s6);
		
	}

}
