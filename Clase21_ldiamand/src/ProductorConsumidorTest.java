
public class ProductorConsumidorTest {

	public static void main(String[] args) {
		Pila pila = new Pila(1);
		Productor p1 = 
			new Productor(pila, "Productor 1", 200);
		Productor p2 =
			new Productor(pila, "Productor 2", 200);
		Consumidor c1 =
			new Consumidor(pila, "Consumidor 1", 200);
		Consumidor c2 =
			new Consumidor(pila, "Consumidor 2", 200);
		p1.start();
		p2.start();
		c1.start();
		c2.start();
		try {
			p1.join();
			p2.join();
			c1.join();
			c2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
