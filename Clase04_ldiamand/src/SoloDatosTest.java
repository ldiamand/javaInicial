
public class SoloDatosTest {

	public static void main(String[] args) {
		SoloDatos sd1 = new SoloDatos();
		sd1.setI(1); // sd1.i = 1
		System.out.println(sd1.getI4()); // sd1.i
		System.out.println(sd1.getD());
		
		SoloDatos sd2 = sd1;
		sd1 = null;
		sd2.setI(1);
		
		int i = 3;
		System.out.println(i);
	}
}
