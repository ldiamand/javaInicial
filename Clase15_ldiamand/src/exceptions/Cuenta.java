package exceptions;

public class Cuenta {

	private double saldo;
	
	private static final double DOLAR = 8.5;
	
	public Cuenta(double cant) {
		this.saldo = cant;
	}
	
	public double extraer (double cant) throws SinSaldoException {
		if (saldo < cant) {
			throw new SinSaldoException();
		}
		saldo -= cant;
		return cant;
	}
	
	public double extraerDolares (double cantDolares) {
		if (saldo < cantDolares * DOLAR) {
			throw new SinDolaresException();
		}
		saldo -= cantDolares * DOLAR;
		return cantDolares;
	}
	
}
