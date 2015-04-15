package net.polotecnologico.polimorfismo;

public class Libro implements Ordenable <Libro> {

	private String titulo;
	
	private int anioPublicacion;
	
	public Libro (String titulo, int anioPublicacion) {
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}
	
	public String getTitulo () {
		return titulo;
	}
	
	public int getAnioPublicacion () {
		return anioPublicacion;
	}
	
	@Override
	public int compareTo(Libro ord) {
//		if (ord instanceof Libro) {
//			Libro tmp = (Libro) ord;
			return this.anioPublicacion - ord.anioPublicacion;
//		}
		// Todavia no lo vimos
//		throw new IllegalArgumentException("No es un libro");
	}
	
	@Override
	public String toString() {
		return titulo + ", " + anioPublicacion;
	}

}
