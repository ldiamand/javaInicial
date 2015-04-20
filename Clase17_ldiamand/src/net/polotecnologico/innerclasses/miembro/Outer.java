package net.polotecnologico.innerclasses.miembro;

public class Outer {

	private int campo1;
	
	public int getCampo1() {
		return campo1;
	}
	
	class Inner {
		
		private int campo1Inner;
		
		private int campo1;
	    // mas miembros internos
		
		public void imprimir() {
			Outer.this.campo1 = 1;
		}
	}

	public void crearInner() {
		Inner in = new Inner();
		in.campo1Inner = 1;
	}
	
}
