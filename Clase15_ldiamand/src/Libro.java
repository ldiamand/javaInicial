
public class Libro implements Comparable<Libro> {

	private String titulo;
	
	private int anio;
	
	public Libro(String titulo, int anio) {
		this.titulo = titulo;
		this.anio = anio;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public int getAnio() {
		return anio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Libro) {
			Libro tmp = (Libro) obj;
			return titulo.equals(tmp.titulo) && anio == tmp.anio;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return anio + titulo.hashCode();
	}
	
	@Override
	public String toString() {
		return titulo + ", " + anio;
	}

	@Override
	public int compareTo(Libro o) {
		return titulo.compareTo(o.titulo);
	}
}
