package net.polotecnologico.clase12;

import java.io.Serializable;

public class Test {
	
	public static void main(String[] args) {
		Cuadrado cua = new Cuadrado(2);
		Circulo cir = new Circulo();
		Triangulo tri = new Triangulo();
		
//		Figura f = new Figura();
		
		// Codigo independiente de la implementacion
		
		Figura [] figuras = new Figura[3];
		figuras[0] = cua;
		figuras[1] = cir;
		figuras[2] = tri;
		
		muestraArea(figuras);
		
	}

	private static void muestraArea(Figura[] figuras) {
		for (Figura figura : figuras) {
			if (figura != null) {
				System.out.println(figura.area());
				if (figura instanceof Triangulo) {
					Triangulo t = (Triangulo) figura;
					System.out.println(t.isEquilatero());
				}
			}
		}
		
	}
}
