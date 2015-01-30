/**
 * Erstellt eine Klasse Auto
 * @author Sven Marquardt
 *
 */
public class Auto {
	String hersteller;
	long laufleistung;
	double preis;
	String farbe;
	boolean unfallwagen;
	String kraftstoff;
	double leistung;
	
	/**
	 * Zum erstellen mehrer Autos 
	 * @param h Der hersteller des Autos	
	 * @param l Die Laufzeit des Autos
	 * @param p Der Preis des Autos
	 * @param f Die farbe des Autos
	 * @param u Ob Unfallwagen oder nicht 
	 * @param k Der Kraftstoff des Autos
	 * @param le Die leistung des Autos
	 */
	public Auto(String h, long l, double p, String f, boolean u, String k,double le) {
		this.hersteller=h;
		this.laufleistung=l;
		this.preis=p;
		this.farbe=f;
		this.unfallwagen=u;
		this.kraftstoff=k;
		this.leistung=le;
	}
	/**
	 * Gibt die Autos als String zurück 
	 */
	public String toString() {
		return "-------\nHersteller: "+this.hersteller+"\n"+"Preis: "+this.preis+"€\n"+
		"Motor: "+this.leistung+"PS ("+this.kraftstoff+")\n"+"KM-Stand: "+this.laufleistung
		+" km\n"+"Farbe: "+this.farbe+"\n"+(!this.unfallwagen?"unfallfrei":""+"------\n");
		
	}
	
}
