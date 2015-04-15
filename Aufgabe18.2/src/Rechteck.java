/**
 * 
 * @author Sven Marquardt
 *
 */
public class Rechteck extends FigMZLA {

	/**
	 * Initiiert ein Objekt von Rechteck
	 * Erstellt ein Objekt vom typ Rechteck.
	 * @param x X-Achse auf dem Blatt
	 * @param y Y-Achse auf dem Blatt
	 * @param z Z-Achse auf dem Blatt
	 * @param a Kante a des rechtecks
	 * @param b Kante b des Rechtecks
	 */
	public Rechteck(int x,int y,int z,int a,int b){
		super(x,y,z,a,b);
		this.figurenTyp = "Rechteck";
	}

	/**
	 * Berechnet die flaeche des Rechtecks
	 */
	@Override
	public double berechneFlaeche(){
		return A*B;
	}
	

}
