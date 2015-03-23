/**
 * 
 * @author Sven Marquardt
 *
 */
public class RWDreieck extends FigMZLA{
	

	/**
	 * Initiiert ein Objekt von RWDreieck
	 * Erstellt ein Objekt vom typ RWDreieck
	 * @param x X-Achse auf dem Blatt
	 * @param y Y-Achse auf dem Blatt
	 * @param z Z-Achse auf dem Blatt
	 * @param a Kathete a des Dreiecks
	 * @param b Kathete b des Dreiecks
	 */
	public RWDreieck(int x,int y,int z,int a,int b){
		super(x,y,z,a,b);
		this.figurenTyp = "Rechtwinkliges Dreieck";
	}

	/**
	 * Berechnet die Flaeche des rechtwinkligen Dreiecks
	 */
	@Override
	public double berechneFlaeche() {
		return (A*B)/2;
	}
	
	/*
	 * Eine änderung im System :D 
	 */
	
}
