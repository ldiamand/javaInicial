
public class Forma1Final2 {

	// Inicializacion en la declaracion
	private final Integer i; // Autoboxing
	
	public Forma1Final2(int i) {
		this.i = i;
	}
	
	public Integer getI() {
		return i;
	}
	
	public void metodoCambiaValor() {
//		i = 1; // NC porque i es final
	}
}
