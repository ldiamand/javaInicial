
public class Arbol {

	private double altura;
	
	private String tipo;
	
	private String nombre;
	
	public Arbol() {
		this(1.0);
//		altura = 1;
		tipo = "Fresno";
	}
	
	public Arbol(double nAltura) {
		altura = nAltura;
	}
	
	public Arbol (String nTipo) {
		tipo = nTipo;
	}
	
	public Arbol (String nNombre, double nAltura) {
		
	}
	
	public Arbol (double nAltura, String nNombre) {
		
	}
	
	public double getAltura () {
		return altura;
	}
	
	public String getTipo () {
		return tipo;
	}
	
}
