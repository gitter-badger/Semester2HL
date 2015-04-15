
/**
 * Klasse Kreis erbt von Ellipse
 * @author Sven Marquardt
 *
 */
public class Kreis extends Ellipse{

	/**
	 * Initiiert ein Objekt von Kreis
	 * Erstellt ein Objekt vom typ Kreis.
	 * @param x X-Achse auf dem Blatt
	 * @param y Y-Achse auf dem Blatt
	 * @param z Z-Achse auf dem Blatt
	 * @param a Radius des Kreises
	 */
	public Kreis(int x, int y, int z, int a) {
		super(x, y, z, a, a);
		this.figurenTyp="Kreis";
	}
	

}
