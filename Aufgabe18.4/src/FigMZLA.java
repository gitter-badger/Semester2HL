/**
 * 
 * @author Sven Marquardt
 *
 */
public abstract class FigMZLA extends Figur{

	protected int A;
	protected int B;
	protected String figurenTyp;
	protected static  double gesamtFlaeche;
	
	
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
		gesamtFlaeche+=this.berechneFlaeche();
	}
	
	
	
	
	
	/**
	 * Berechnet saemtliche flaechen 
	 * @return Die flaeche der gegebenen Figuren
	 */
	public abstract double berechneFlaeche();
	
	
	public String toString() {
		return "Die Gesamtflaeche aller "+anzFiguren()+" Figuren betreagt "+gesamtFlaeche+" Flaecheneinheiten.\n"+
				"Die durchschnittliche Flaeche pro Figur betreagt "+gesamtFlaeche/anzFiguren()+"Flaecheneinheiten";
	}
	
}
