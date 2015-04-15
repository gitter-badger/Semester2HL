/**
 * 
 * @author Sven Marquardt
 *
 */
public class Quadrat extends Rechteck{
	/**
	 * Initiiert ein Objekt von Quadrat
	 * Erstellt ein Objekt vom typ Rechteck.
	 * @param x X-Achse auf dem Blatt
	 * @param y Y-Achse auf dem Blatt
	 * @param z Z-Achse auf dem Blatt
	 * @param a Kante des Quadrats
	 */
	public Quadrat(int x, int y, int z, int a) {
		super(x, y, z, a,a);
		this.figurenTyp = "Quadrat";
	}
	
	
	
}
