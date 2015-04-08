import java.util.HashMap;
import java.util.Map;


public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> mapa =
				new HashMap<String, Integer>();
		
		mapa.put("Luciano", new Integer(20));
		mapa.put("Pepe", new Integer(100));

		System.out.println(mapa.get("Pepe"));
		System.out.println(mapa.size());
		
		mapa.put("Pepe", new Integer(101));
		System.out.println(mapa.get("Pepe"));
	}
}
