/**
 * 
 * @author Sven Marquardt 
 *
 */
public class Ellipse extends FigMZLA{

	/**
	 * Initiiert ein Objekt von Ellipse
	 * Erstellt ein Objekt vom typ Ellipse.
	 * @param x X-Achse auf dem Blatt
	 * @param y Y-Achse auf dem Blatt
	 * @param z Z-Achse auf dem Blatt
	 * @param a Halbkreis a
	 * @param b Halbkreis b
	 */
	public Ellipse(int x, int y, int z, int a, int b) {
		super(x, y, z, a, b);
		this.figurenTyp="Ellipse";
	}

	/**
	 * Berechnet die flaeche der Ellipse 
	 */
	@Override
	public double berechneFlaeche() {
		return Math.PI * A * B;
	}
	

}
