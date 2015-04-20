package net.polotecnologico.innerclasses.locales;

public class Outer {

	private int campo1;
	
	public void metodo() {
		campo1 = 0;
//		new Inner(); // NC
		if (campo1 > 2) {
			class Inner {
		
				public void metodoInterno() {
					
				}
			}
			campo1 = 1;
			
			Inner i = new Inner();
			i.metodoInterno();
		}
	}
	
	public void metodoExterno() {
//		Inner i2 = new Inner(); // NC
	}
}
