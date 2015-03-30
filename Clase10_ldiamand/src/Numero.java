
public enum Numero {

	UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), 
	SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), ONCE(11), DOCE(12);
	
	private int valor;
	
	private Numero(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}

	public int compara(Numero n) {
		return this.compareTo(n);
	}
	
}
