
public class Forma3 {

	private Integer i;
	
	public Forma3() {
		// Aca no
	}
	
	// Inicializacion peresoza o lazy initialization
	public Integer getI() {
		if (i == null) {
			i = new Integer(4);
		}
		return i;
	}
	
}
