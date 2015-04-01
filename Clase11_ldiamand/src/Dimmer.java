
public class Dimmer extends Lampara {

	private int intensidad;
	
	public void inc() {
		intensidad++;
		if (!isPrendida()) {
			super.on();
		}
	}
	
	public void on() {
		inc();
	}
	
	public void dec() {
		intensidad--;
	}
	
	public int getIntensidad() {
		return intensidad;
	}

}
