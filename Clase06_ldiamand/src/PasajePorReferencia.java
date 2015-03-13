
public class PasajePorReferencia {

	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.getI());
		
		t1.setI(1);
		
		System.out.println(t1.getI());
		
		cambioValorI(t1);
		
		System.out.println(t1.getI());
	}

	private static void cambioValorI(Test t1) {
		t1.setI(5);
		t1 = null;
		t1 = new Test();
	}
}
