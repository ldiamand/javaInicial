package net.polotecnologico.polimorfismo;

public class Test {
	
    public static void main(String[] args) {
		Libro l1 = new Libro("Libro 1", 2000);
		Libro l2 = new Libro("Libro 2", 1756);
		Libro l3 = new Libro("Libro 3", 2010);
		Libro l4 = new Libro("Libro 4", 1945);
		
		Libro [] libros = new Libro[4];
		libros[0] = l1;
		libros[1] = l2;
		libros[2] = l3;
		libros[3] = l4;
	
		Ordenador.ordenar(libros);
		
		for (Libro libro : libros) {
			System.out.println(libro);
		}
		
	}
    
}
