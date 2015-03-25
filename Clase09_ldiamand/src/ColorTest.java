
public class ColorTest {

	public static void main(String[] args) {
		Color negro = Color.NEGRO;
		Color gris = Color.GRIS;
		Color blanco = Color.BLANCO;
		
		System.out.println(blanco.getColor());
//		Color grisClaro = new Color(200);
		Color2 negro2 = Color2.NEGRO;
		Color2 gris2 = Color2.GRIS;
		Color2 blanco2 = Color2.BLANCO;
		
		System.out.println(blanco2.getColor());
//		Color2 grisClaro = new Color2(200);
		
		
		
		
		Color2 [] colores = Color2.values();
		for (Color2 color2 : colores) {
			System.out.println(color2);
		}
		Color2 c = Color2.valueOf("NEGRO");
		System.out.println(c.getColor());
		
		Color2 c2 = Color2.BLANCO;
		switch (c2) {
		case BLANCO:
		case NEGRO:
		case GRIS:
		}
		
		
	}
}
