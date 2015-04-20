package net.polotecnologico.innerclasses.anonimas;

public class Outer {

	public void metodo1() {
//		ClaseEjemplo ce1 = new ClaseEjemplo();
//		metodo2(ce1);
		
		metodo2(new InterfaceEjemplo() {
			
			private int i;
			
			{
				i = 5;
			}
			
			@Override
			public void imprimir() {
				// Hace algo
			}
			
		});
	}
	
	private void metodo2(InterfaceEjemplo ce) {
		ce.imprimir();
	}
}
