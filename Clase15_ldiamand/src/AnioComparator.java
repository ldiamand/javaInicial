import java.util.Comparator;


public class AnioComparator implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		return o1.getAnio() - o2.getAnio();
	}

}
