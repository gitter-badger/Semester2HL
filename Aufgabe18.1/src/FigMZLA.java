/**
 * 
 * @author Sven Marquardt
 *
 */
public abstract class FigMZLA extends Figur{

	protected int A;
	protected int B;
	protected String figurenTyp;
	/**
	 * Initiiert ein Objekt von FigMLZA
	 * Erstellt ein Objekt vom typ FigMLZA
	 * @param x X-Achse auf dem Blatt
	 * @param y Y-Achse auf dem Blatt
	 * @param z Z-Achse auf dem Blatt
	 * @param a Platzhalter fuer Figuren einheiten
	 * @param b Platzhalter fuer Figuren einheiten
	 */
	public FigMZLA(int x,int y,int z,int a,int b){
		super(x,y,z);
		this.A=a;
		this.B=b;
	}
	
	/**
	 * Berechnet saemtliche flaechen 
	 * @return Die flaeche der gegebenen Figuren
	 */
	public abstract double berechneFlaeche();
	
	/**
	 * Gibt die gegebene Figur aus mit Flache und platz auf dem Blatt
	 */
	public String toString() {
		return this.figurenTyp + " an der Position ("+this.X +","+this.Y+","+this.Z+") mit einer Flaeche von " +this.berechneFlaeche() +" Flaecheneinheiten."; 
	}
}
