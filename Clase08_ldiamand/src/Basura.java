
public class Basura {

	private String nombre;
	
	public Basura (String nombre) {
		this.nombre = nombre;
	}
	
	public void finalize() {
		System.out.println("Adios mundo cruel! [" + nombre + "]");
	}
}
