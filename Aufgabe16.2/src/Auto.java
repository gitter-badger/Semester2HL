import java.util.LinkedList;
import java.util.List;

/**
 * Erstellt eine Klasse Auto
 * @author Sven Marquardt
 *
 */
public class Auto {
	private String hersteller;
	private long laufleistung;
	private double preis;
	private String farbe;
	private boolean unfallwagen;
	private String kraftstoff;
	private double leistung;
	private static List<Auto> autos=new LinkedList<Auto>();
	
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
		autos.add(this);
	}
	/**
	 * Gibt den Bestand an Autos aus {@link #autos}
	 * @return Die Autos 
	 */
	public static  List<Auto> getBestand() {
		return autos;
	}
	/**
	 * Zählt die anzahl der Autos in {@link #autos} 
	 * @return Die Anzahl der Autos 
	 */
	public static int getAnzahl() {
		int i=0;
		for (Auto a : autos) {
			i++;
		}
		return i;
	}
	/**
	 * Getter Methode 
	 * @return Den Herrsteller
	 */
	public String getHersteller(){
		return this.hersteller;
	}
	/**
	 * Getter Methode
	 * @return Die Laufleistung
 	 */
	public double getLaufleistunng() {
		return this.laufleistung;
	}
	/**
	 * Getter Mehtode
	 * @return Den Preis
	 */
	public double getPreis() {
		return this.preis;
	}
	/**
	 * Getter Methode
	 * @return Die Farbe 
	 */
	public String getFarbe() {
		return this.farbe;
	}
	/**
	 * Getter Methode
	 * @return Den Unfalltyp
	 */
	public boolean isUnfallwagen() {
		return this.unfallwagen;
	}
	/**
	 * Getter Methode 
	 * @return Den Kraftstoff
	 */
	public String getKraftstoff() {
		return this.kraftstoff;
	}
	/**
	 * Getter Methode 
	 * @return Die Leistung 
	 */
	public double getLeistung() {
		return this.leistung;
	}
	/**
	 * Gibt die Autos als String zurück 
	 */
	public String toString() {
		return "-------\nHersteller: "+this.hersteller+"\n"+"Preis: "+this.preis+"€\n"+
		"Motor: "+this.leistung+"PS ("+this.kraftstoff+")\n"+"KM-Stand: "+this.laufleistung
		+" km\n"+"Farbe: "+this.farbe+"\n"+(!this.unfallwagen?"unfallfrei\n--------\n":"--------\n");
		
	}
	
}
