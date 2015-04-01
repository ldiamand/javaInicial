
public class DimmerTest {

	public static void main(String[] args) {
		Dimmer d = new Dimmer();
		d.on();
		System.out.println(d.isPrendida());
		d.off();
		System.out.println(d.isPrendida());
		
		Dimmer d2 = new Dimmer();
		d2.inc();
		System.out.println(d2.getIntensidad());
		System.out.println(d2.isPrendida());
		
		Dimmer d3 = new Dimmer();
		d3.on();
		System.out.println(d3.getIntensidad());
		System.out.println(d3.isPrendida());
		
	}
}
